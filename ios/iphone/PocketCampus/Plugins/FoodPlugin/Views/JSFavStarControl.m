//
//  JSFaveStarControl.m
//  FavStarControl
//
//  Created by James "Jasarien" Addyman on 17/02/2010.
//  Copyright 2010 JamSoft. All rights reserved.
//  http://jamsoftonline.com
//

#import "JSFavStarControl.h"

#define RATING_MAX 5

@implementation JSFavStarControl

@synthesize rating = _rating;

- (id)initWithCenter:(CGPoint)center dotImage:(UIImage *)dotImage starImage:(UIImage *)starImage emptyStarImage:(UIImage*)emptyStarImage editable:(BOOL)editable
{
	if (self = [self initWithFrame:CGRectMake(0, 0, 100, 20)])
	{
        self.center = center;
		_rating = 0;
		self.backgroundColor = [UIColor clearColor];
		self.opaque = NO;
		
		_dot = [dotImage retain];
		_star = [starImage retain];
        _emptyStar = [emptyStarImage retain];
        _editable = editable;
        self.enabled = _editable;
	}
	
	return self;
}

- (void)setEditable:(BOOL)editable resetRating:(BOOL)resetRating {
    _editable = editable;
    self.enabled = _editable;
    if (resetRating) {
        [self setRating:0];
    } else {
        [self setNeedsDisplay];
    }
}

- (void)setRating:(NSInteger)newRating {
    if (newRating < 0) {
        _rating = 0;
    } else if (newRating > RATING_MAX) {
        _rating = RATING_MAX;
    } else {
        _rating = newRating;
    }
    [self setNeedsDisplay];
}

- (void)drawRect:(CGRect)rect
{
	CGPoint currPoint = CGPointZero;
	
	for (int i = 0; i < _rating; i++)
	{
		if (_star)
			[_star drawAtPoint:currPoint];
		else
			[@"★" drawAtPoint:currPoint withFont:[UIFont boldSystemFontOfSize:22]];
			
		currPoint.x += 20;
	}
	
    NSInteger remaining = RATING_MAX - _rating;
    
    if (_editable) {
        for (int i = 0; i < remaining; i++)
        {
            if (_dot)
                [_dot drawAtPoint:currPoint];
            else
                [@" •" drawAtPoint:currPoint withFont:[UIFont boldSystemFontOfSize:22]];
            currPoint.x += 20;
        }
    } else {
        for (int i = 0; i < remaining; i++)
        {
            if (_emptyStar)
                [_emptyStar drawAtPoint:currPoint];
            else
                [@"  " drawAtPoint:currPoint withFont:[UIFont boldSystemFontOfSize:22]];
            currPoint.x += 20;
        }
    }
}


- (void)dealloc
{
	[_dot release];
	[_star release];
	
	_dot = nil,
	_star = nil;
	
    [super dealloc];
}


- (BOOL)beginTrackingWithTouch:(UITouch *)touch withEvent:(UIEvent *)event
{
	if (!_editable) {
        return NO;
    }
    
    CGFloat width = self.frame.size.width;
	CGRect section = CGRectMake(0, 0, width / RATING_MAX, self.frame.size.height);
	
	CGPoint touchLocation = [touch locationInView:self];
	
	for (int i = 0; i < RATING_MAX; i++)
	{		
		if (touchLocation.x > section.origin.x && touchLocation.x < section.origin.x + section.size.width)
		{ // touch is inside section
			if (_rating != (i+1))
			{
				_rating = i+1;
				[self sendActionsForControlEvents:UIControlEventValueChanged];
			}
			
			break;
		}
		
		section.origin.x += section.size.width;
	}
	
	[self setNeedsDisplay];
	return YES;
}

- (BOOL)continueTrackingWithTouch:(UITouch *)touch withEvent:(UIEvent *)event
{
	CGFloat width = self.frame.size.width;
	CGRect section = CGRectMake(0, 0, width / RATING_MAX, self.frame.size.height);
	
	CGPoint touchLocation = [touch locationInView:self];
	
	if (touchLocation.x < 0)
	{
		if (_rating != 0)
		{	
			_rating = 0;
			[self sendActionsForControlEvents:UIControlEventValueChanged];
		}
	}
	else if (touchLocation.x > width)
	{
		if (_rating != 5)
		{
			_rating = 5;
			[self sendActionsForControlEvents:UIControlEventValueChanged];
		}
	}
	else
	{
		for (int i = 0; i < RATING_MAX; i++)
		{
			if (touchLocation.x > section.origin.x && touchLocation.x < section.origin.x + section.size.width)
			{ // touch is inside section
				if (_rating != (i+1))
				{
					_rating = i+1;
					[self sendActionsForControlEvents:UIControlEventValueChanged];
				}
				break;
			}
			
			section.origin.x += section.size.width;
		}
	}
	
	[self setNeedsDisplay];
	return YES;
}

- (void)endTrackingWithTouch:(UITouch *)touch withEvent:(UIEvent *)event
{
	CGFloat width = self.frame.size.width;
	CGRect section = CGRectMake(0, 0, width / RATING_MAX, self.frame.size.height);
	
	CGPoint touchLocation = [touch locationInView:self];
	
	if (touchLocation.x < 0)
	{
		if (_rating != 0)
		{	
			_rating = 0;
			[self sendActionsForControlEvents:UIControlEventValueChanged];
		}
	}
	else if (touchLocation.x > width)
	{
		if (_rating != 5)
		{
			_rating = 5;
			[self sendActionsForControlEvents:UIControlEventValueChanged];
		}
		
	}
	else
	{
		for (int i = 0; i < RATING_MAX; i++)
		{
			if (touchLocation.x > section.origin.x && touchLocation.x < section.origin.x + section.size.width)
			{
				if (_rating != (i+1))
				{
					_rating = i+1;
					[self sendActionsForControlEvents:UIControlEventValueChanged];
				}
				
				break;
			}
			
			section.origin.x += section.size.width;
		}
	}
	
	[self setNeedsDisplay];
}

@end
