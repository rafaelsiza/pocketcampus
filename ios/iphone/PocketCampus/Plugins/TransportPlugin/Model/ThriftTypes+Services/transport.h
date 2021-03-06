/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 * 
 *
 * WARNING : Point class must be renamed to GeoPoint
 */

#import <Foundation/Foundation.h>

#import <TProtocol.h>
#import <TApplicationException.h>
#import <TProtocolUtil.h>
#import <TProcessor.h>

#import "common.h"

enum TransportStationType {
  TransportStationType_ANY = 0,
  TransportStationType_STATION = 1,
  TransportStationType_POI = 2,
  TransportStationType_ADDRESS = 3
};

enum Type {
  Type_ADULT = 0,
  Type_CHILD = 1,
  Type_YOUTH = 2,
  Type_STUDENT = 3,
  Type_MILITARY = 4,
  Type_SENIOR = 5,
  Type_DISABLED = 6
};

enum FareType {
  FareType_ADULT = 0,
  FareType_CHILD = 1,
  FareType_YOUTH = 2,
  FareType_STUDENT = 3,
  FareType_MILITARY = 4,
  FareType_SENIOR = 5,
  FareType_DISABLED = 6
};

enum NearbyStatus {
  NearbyStatus_OK = 0,
  NearbyStatus_INVALID_STATION = 1,
  NearbyStatus_SERVICE_DOWN = 2
};

enum Status {
  Status_sOK = 0,
  Status_AMBIGUOUS = 1,
  Status_TOO_CLOSE = 2,
  Status_UNRESOLVABLE_ADDRESS = 3,
  Status_NO_CONNECTIONS = 4,
  Status_INVALID_DATE = 5,
  Status_SERVICE_DOWN = 6
};

typedef int64_t timestamp;

typedef int32_t Integer;

@interface TransportStation : NSObject <NSCoding> {
  int __type;
  int32_t __id;
  int32_t __latitude;
  int32_t __longitude;
  NSString * __place;
  NSString * __name;

  BOOL __type_isset;
  BOOL __id_isset;
  BOOL __latitude_isset;
  BOOL __longitude_isset;
  BOOL __place_isset;
  BOOL __name_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, getter=type, setter=setType:) int type;
@property (nonatomic, getter=id, setter=setId:) int32_t id;
@property (nonatomic, getter=latitude, setter=setLatitude:) int32_t latitude;
@property (nonatomic, getter=longitude, setter=setLongitude:) int32_t longitude;
@property (nonatomic, retain, getter=place, setter=setPlace:) NSString * place;
@property (nonatomic, retain, getter=name, setter=setName:) NSString * name;
#endif

- (id) initWithType: (int) type id: (int32_t) id latitude: (int32_t) latitude longitude: (int32_t) longitude place: (NSString *) place name: (NSString *) name;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (int) type;
- (void) setType: (int) type;
- (BOOL) typeIsSet;

- (int32_t) id;
- (void) setId: (int32_t) id;
- (BOOL) idIsSet;

- (int32_t) latitude;
- (void) setLatitude: (int32_t) latitude;
- (BOOL) latitudeIsSet;

- (int32_t) longitude;
- (void) setLongitude: (int32_t) longitude;
- (BOOL) longitudeIsSet;

- (NSString *) place;
- (void) setPlace: (NSString *) place;
- (BOOL) placeIsSet;

- (NSString *) name;
- (void) setName: (NSString *) name;
- (BOOL) nameIsSet;

@end

@interface Fare : NSObject <NSCoding> {
  NSString * __network;
  int __type;
  NSString * __currency;
  double __fare;
  NSString * __unitName;
  NSString * __units;

  BOOL __network_isset;
  BOOL __type_isset;
  BOOL __currency_isset;
  BOOL __fare_isset;
  BOOL __unitName_isset;
  BOOL __units_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, retain, getter=network, setter=setNetwork:) NSString * network;
@property (nonatomic, getter=type, setter=setType:) int type;
@property (nonatomic, retain, getter=currency, setter=setCurrency:) NSString * currency;
@property (nonatomic, getter=fare, setter=setFare:) double fare;
@property (nonatomic, retain, getter=unitName, setter=setUnitName:) NSString * unitName;
@property (nonatomic, retain, getter=units, setter=setUnits:) NSString * units;
#endif

- (id) initWithNetwork: (NSString *) network type: (int) type currency: (NSString *) currency fare: (double) fare unitName: (NSString *) unitName units: (NSString *) units;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (NSString *) network;
- (void) setNetwork: (NSString *) network;
- (BOOL) networkIsSet;

- (int) type;
- (void) setType: (int) type;
- (BOOL) typeIsSet;

- (NSString *) currency;
- (void) setCurrency: (NSString *) currency;
- (BOOL) currencyIsSet;

- (double) fare;
- (void) setFare: (double) fare;
- (BOOL) fareIsSet;

- (NSString *) unitName;
- (void) setUnitName: (NSString *) unitName;
- (BOOL) unitNameIsSet;

- (NSString *) units;
- (void) setUnits: (NSString *) units;
- (BOOL) unitsIsSet;

@end

@interface GeoPoint : NSObject <NSCoding> {
  int32_t __latitude;
  int32_t __longitude;

  BOOL __latitude_isset;
  BOOL __longitude_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, getter=latitude, setter=setLatitude:) int32_t latitude;
@property (nonatomic, getter=longitude, setter=setLongitude:) int32_t longitude;
#endif

- (id) initWithLatitude: (int32_t) latitude longitude: (int32_t) longitude;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (int32_t) latitude;
- (void) setLatitude: (int32_t) latitude;
- (BOOL) latitudeIsSet;

- (int32_t) longitude;
- (void) setLongitude: (int32_t) longitude;
- (BOOL) longitudeIsSet;

@end

@interface TransportLine : NSObject <NSCoding> {
  NSString * __name;
  NSArray * __colors;

  BOOL __name_isset;
  BOOL __colors_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, retain, getter=name, setter=setName:) NSString * name;
@property (nonatomic, retain, getter=colors, setter=setColors:) NSArray * colors;
#endif

- (id) initWithName: (NSString *) name colors: (NSArray *) colors;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (NSString *) name;
- (void) setName: (NSString *) name;
- (BOOL) nameIsSet;

- (NSArray *) colors;
- (void) setColors: (NSArray *) colors;
- (BOOL) colorsIsSet;

@end

@interface Stop : NSObject <NSCoding> {
  TransportStation * __location;
  NSString * __position;
  timestamp __time;

  BOOL __location_isset;
  BOOL __position_isset;
  BOOL __time_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, retain, getter=location, setter=setLocation:) TransportStation * location;
@property (nonatomic, retain, getter=position, setter=setPosition:) NSString * position;
@property (nonatomic, getter=time, setter=setTime:) timestamp time;
#endif

- (id) initWithLocation: (TransportStation *) location position: (NSString *) position time: (timestamp) time;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (TransportStation *) location;
- (void) setLocation: (TransportStation *) location;
- (BOOL) locationIsSet;

- (NSString *) position;
- (void) setPosition: (NSString *) position;
- (BOOL) positionIsSet;

- (timestamp) time;
- (void) setTime: (timestamp) time;
- (BOOL) timeIsSet;

@end

@interface TransportConnection : NSObject <NSCoding> {
  TransportStation * __departure;
  TransportStation * __arrival;
  NSArray * __path;
  TransportLine * __line;
  TransportStation * __destination;
  timestamp __departureTime;
  NSString * __departurePosition;
  timestamp __arrivalTime;
  NSString * __arrivalPosition;
  NSArray * __intermediateStops;
  BOOL __foot;
  int32_t __min;

  BOOL __departure_isset;
  BOOL __arrival_isset;
  BOOL __path_isset;
  BOOL __line_isset;
  BOOL __destination_isset;
  BOOL __departureTime_isset;
  BOOL __departurePosition_isset;
  BOOL __arrivalTime_isset;
  BOOL __arrivalPosition_isset;
  BOOL __intermediateStops_isset;
  BOOL __foot_isset;
  BOOL __min_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, retain, getter=departure, setter=setDeparture:) TransportStation * departure;
@property (nonatomic, retain, getter=arrival, setter=setArrival:) TransportStation * arrival;
@property (nonatomic, retain, getter=path, setter=setPath:) NSArray * path;
@property (nonatomic, retain, getter=line, setter=setLine:) TransportLine * line;
@property (nonatomic, retain, getter=destination, setter=setDestination:) TransportStation * destination;
@property (nonatomic, getter=departureTime, setter=setDepartureTime:) timestamp departureTime;
@property (nonatomic, retain, getter=departurePosition, setter=setDeparturePosition:) NSString * departurePosition;
@property (nonatomic, getter=arrivalTime, setter=setArrivalTime:) timestamp arrivalTime;
@property (nonatomic, retain, getter=arrivalPosition, setter=setArrivalPosition:) NSString * arrivalPosition;
@property (nonatomic, retain, getter=intermediateStops, setter=setIntermediateStops:) NSArray * intermediateStops;
@property (nonatomic, getter=foot, setter=setFoot:) BOOL foot;
@property (nonatomic, getter=min, setter=setMin:) int32_t min;
#endif

- (id) initWithDeparture: (TransportStation *) departure arrival: (TransportStation *) arrival path: (NSArray *) path line: (TransportLine *) line destination: (TransportStation *) destination departureTime: (timestamp) departureTime departurePosition: (NSString *) departurePosition arrivalTime: (timestamp) arrivalTime arrivalPosition: (NSString *) arrivalPosition intermediateStops: (NSArray *) intermediateStops foot: (BOOL) foot min: (int32_t) min;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (TransportStation *) departure;
- (void) setDeparture: (TransportStation *) departure;
- (BOOL) departureIsSet;

- (TransportStation *) arrival;
- (void) setArrival: (TransportStation *) arrival;
- (BOOL) arrivalIsSet;

- (NSArray *) path;
- (void) setPath: (NSArray *) path;
- (BOOL) pathIsSet;

- (TransportLine *) line;
- (void) setLine: (TransportLine *) line;
- (BOOL) lineIsSet;

- (TransportStation *) destination;
- (void) setDestination: (TransportStation *) destination;
- (BOOL) destinationIsSet;

- (timestamp) departureTime;
- (void) setDepartureTime: (timestamp) departureTime;
- (BOOL) departureTimeIsSet;

- (NSString *) departurePosition;
- (void) setDeparturePosition: (NSString *) departurePosition;
- (BOOL) departurePositionIsSet;

- (timestamp) arrivalTime;
- (void) setArrivalTime: (timestamp) arrivalTime;
- (BOOL) arrivalTimeIsSet;

- (NSString *) arrivalPosition;
- (void) setArrivalPosition: (NSString *) arrivalPosition;
- (BOOL) arrivalPositionIsSet;

- (NSArray *) intermediateStops;
- (void) setIntermediateStops: (NSArray *) intermediateStops;
- (BOOL) intermediateStopsIsSet;

- (BOOL) foot;
- (void) setFoot: (BOOL) foot;
- (BOOL) footIsSet;

- (int32_t) min;
- (void) setMin: (int32_t) min;
- (BOOL) minIsSet;

@end

@interface TransportTrip : NSObject <NSCoding> {
  NSString * __id;
  NSString * __link;
  timestamp __departureTime;
  timestamp __arrivalTime;
  TransportStation * __from;
  TransportStation * __to;
  NSArray * __parts;
  NSArray * __fares;

  BOOL __id_isset;
  BOOL __link_isset;
  BOOL __departureTime_isset;
  BOOL __arrivalTime_isset;
  BOOL __from_isset;
  BOOL __to_isset;
  BOOL __parts_isset;
  BOOL __fares_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, retain, getter=id, setter=setId:) NSString * id;
@property (nonatomic, retain, getter=link, setter=setLink:) NSString * link;
@property (nonatomic, getter=departureTime, setter=setDepartureTime:) timestamp departureTime;
@property (nonatomic, getter=arrivalTime, setter=setArrivalTime:) timestamp arrivalTime;
@property (nonatomic, retain, getter=from, setter=setFrom:) TransportStation * from;
@property (nonatomic, retain, getter=to, setter=setTo:) TransportStation * to;
@property (nonatomic, retain, getter=parts, setter=setParts:) NSArray * parts;
@property (nonatomic, retain, getter=fares, setter=setFares:) NSArray * fares;
#endif

- (id) initWithId: (NSString *) id link: (NSString *) link departureTime: (timestamp) departureTime arrivalTime: (timestamp) arrivalTime from: (TransportStation *) from to: (TransportStation *) to parts: (NSArray *) parts fares: (NSArray *) fares;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (NSString *) id;
- (void) setId: (NSString *) id;
- (BOOL) idIsSet;

- (NSString *) link;
- (void) setLink: (NSString *) link;
- (BOOL) linkIsSet;

- (timestamp) departureTime;
- (void) setDepartureTime: (timestamp) departureTime;
- (BOOL) departureTimeIsSet;

- (timestamp) arrivalTime;
- (void) setArrivalTime: (timestamp) arrivalTime;
- (BOOL) arrivalTimeIsSet;

- (TransportStation *) from;
- (void) setFrom: (TransportStation *) from;
- (BOOL) fromIsSet;

- (TransportStation *) to;
- (void) setTo: (TransportStation *) to;
- (BOOL) toIsSet;

- (NSArray *) parts;
- (void) setParts: (NSArray *) parts;
- (BOOL) partsIsSet;

- (NSArray *) fares;
- (void) setFares: (NSArray *) fares;
- (BOOL) faresIsSet;

@end

@interface Departure : NSObject <NSCoding> {
  timestamp __plannedTime;
  timestamp __predictedTime;
  NSString * __line;
  NSArray * __lineColors;
  NSString * __lineLink;
  NSString * __position;
  int32_t __destinationId;
  NSString * __destination;
  NSString * __message;

  BOOL __plannedTime_isset;
  BOOL __predictedTime_isset;
  BOOL __line_isset;
  BOOL __lineColors_isset;
  BOOL __lineLink_isset;
  BOOL __position_isset;
  BOOL __destinationId_isset;
  BOOL __destination_isset;
  BOOL __message_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, getter=plannedTime, setter=setPlannedTime:) timestamp plannedTime;
@property (nonatomic, getter=predictedTime, setter=setPredictedTime:) timestamp predictedTime;
@property (nonatomic, retain, getter=line, setter=setLine:) NSString * line;
@property (nonatomic, retain, getter=lineColors, setter=setLineColors:) NSArray * lineColors;
@property (nonatomic, retain, getter=lineLink, setter=setLineLink:) NSString * lineLink;
@property (nonatomic, retain, getter=position, setter=setPosition:) NSString * position;
@property (nonatomic, getter=destinationId, setter=setDestinationId:) int32_t destinationId;
@property (nonatomic, retain, getter=destination, setter=setDestination:) NSString * destination;
@property (nonatomic, retain, getter=message, setter=setMessage:) NSString * message;
#endif

- (id) initWithPlannedTime: (timestamp) plannedTime predictedTime: (timestamp) predictedTime line: (NSString *) line lineColors: (NSArray *) lineColors lineLink: (NSString *) lineLink position: (NSString *) position destinationId: (int32_t) destinationId destination: (NSString *) destination message: (NSString *) message;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (timestamp) plannedTime;
- (void) setPlannedTime: (timestamp) plannedTime;
- (BOOL) plannedTimeIsSet;

- (timestamp) predictedTime;
- (void) setPredictedTime: (timestamp) predictedTime;
- (BOOL) predictedTimeIsSet;

- (NSString *) line;
- (void) setLine: (NSString *) line;
- (BOOL) lineIsSet;

- (NSArray *) lineColors;
- (void) setLineColors: (NSArray *) lineColors;
- (BOOL) lineColorsIsSet;

- (NSString *) lineLink;
- (void) setLineLink: (NSString *) lineLink;
- (BOOL) lineLinkIsSet;

- (NSString *) position;
- (void) setPosition: (NSString *) position;
- (BOOL) positionIsSet;

- (int32_t) destinationId;
- (void) setDestinationId: (int32_t) destinationId;
- (BOOL) destinationIdIsSet;

- (NSString *) destination;
- (void) setDestination: (NSString *) destination;
- (BOOL) destinationIsSet;

- (NSString *) message;
- (void) setMessage: (NSString *) message;
- (BOOL) messageIsSet;

@end

@interface GetConnectionDetailsResult : NSObject <NSCoding> {
  timestamp __currentDate;
  TransportTrip * __connection;

  BOOL __currentDate_isset;
  BOOL __connection_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, getter=currentDate, setter=setCurrentDate:) timestamp currentDate;
@property (nonatomic, retain, getter=connection, setter=setConnection:) TransportTrip * connection;
#endif

- (id) initWithCurrentDate: (timestamp) currentDate connection: (TransportTrip *) connection;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (timestamp) currentDate;
- (void) setCurrentDate: (timestamp) currentDate;
- (BOOL) currentDateIsSet;

- (TransportTrip *) connection;
- (void) setConnection: (TransportTrip *) connection;
- (BOOL) connectionIsSet;

@end

@interface LineDestination : NSObject <NSCoding> {
  NSString * __line;
  NSArray * __lineColors;
  int32_t __destinationId;
  NSString * __destination;

  BOOL __line_isset;
  BOOL __lineColors_isset;
  BOOL __destinationId_isset;
  BOOL __destination_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, retain, getter=line, setter=setLine:) NSString * line;
@property (nonatomic, retain, getter=lineColors, setter=setLineColors:) NSArray * lineColors;
@property (nonatomic, getter=destinationId, setter=setDestinationId:) int32_t destinationId;
@property (nonatomic, retain, getter=destination, setter=setDestination:) NSString * destination;
#endif

- (id) initWithLine: (NSString *) line lineColors: (NSArray *) lineColors destinationId: (int32_t) destinationId destination: (NSString *) destination;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (NSString *) line;
- (void) setLine: (NSString *) line;
- (BOOL) lineIsSet;

- (NSArray *) lineColors;
- (void) setLineColors: (NSArray *) lineColors;
- (BOOL) lineColorsIsSet;

- (int32_t) destinationId;
- (void) setDestinationId: (int32_t) destinationId;
- (BOOL) destinationIdIsSet;

- (NSString *) destination;
- (void) setDestination: (NSString *) destination;
- (BOOL) destinationIsSet;

@end

@interface NearbyStationsResult : NSObject <NSCoding> {
  int __status;
  NSArray * __stations;

  BOOL __status_isset;
  BOOL __stations_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, getter=status, setter=setStatus:) int status;
@property (nonatomic, retain, getter=stations, setter=setStations:) NSArray * stations;
#endif

- (id) initWithStatus: (int) status stations: (NSArray *) stations;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (int) status;
- (void) setStatus: (int) status;
- (BOOL) statusIsSet;

- (NSArray *) stations;
- (void) setStations: (NSArray *) stations;
- (BOOL) stationsIsSet;

@end

@interface QueryTripsResult : NSObject <NSCoding> {
  NSArray * __ambiguousFrom;
  NSArray * __ambiguousVia;
  NSArray * __ambiguousTo;
  NSString * __queryUri;
  TransportStation * __from;
  TransportStation * __via;
  TransportStation * __to;
  NSString * __context;
  NSArray * __connections;

  BOOL __ambiguousFrom_isset;
  BOOL __ambiguousVia_isset;
  BOOL __ambiguousTo_isset;
  BOOL __queryUri_isset;
  BOOL __from_isset;
  BOOL __via_isset;
  BOOL __to_isset;
  BOOL __context_isset;
  BOOL __connections_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, retain, getter=ambiguousFrom, setter=setAmbiguousFrom:) NSArray * ambiguousFrom;
@property (nonatomic, retain, getter=ambiguousVia, setter=setAmbiguousVia:) NSArray * ambiguousVia;
@property (nonatomic, retain, getter=ambiguousTo, setter=setAmbiguousTo:) NSArray * ambiguousTo;
@property (nonatomic, retain, getter=queryUri, setter=setQueryUri:) NSString * queryUri;
@property (nonatomic, retain, getter=from, setter=setFrom:) TransportStation * from;
@property (nonatomic, retain, getter=via, setter=setVia:) TransportStation * via;
@property (nonatomic, retain, getter=to, setter=setTo:) TransportStation * to;
@property (nonatomic, retain, getter=context, setter=setContext:) NSString * context;
@property (nonatomic, retain, getter=connections, setter=setConnections:) NSArray * connections;
#endif

- (id) initWithAmbiguousFrom: (NSArray *) ambiguousFrom ambiguousVia: (NSArray *) ambiguousVia ambiguousTo: (NSArray *) ambiguousTo queryUri: (NSString *) queryUri from: (TransportStation *) from via: (TransportStation *) via to: (TransportStation *) to context: (NSString *) context connections: (NSArray *) connections;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (NSArray *) ambiguousFrom;
- (void) setAmbiguousFrom: (NSArray *) ambiguousFrom;
- (BOOL) ambiguousFromIsSet;

- (NSArray *) ambiguousVia;
- (void) setAmbiguousVia: (NSArray *) ambiguousVia;
- (BOOL) ambiguousViaIsSet;

- (NSArray *) ambiguousTo;
- (void) setAmbiguousTo: (NSArray *) ambiguousTo;
- (BOOL) ambiguousToIsSet;

- (NSString *) queryUri;
- (void) setQueryUri: (NSString *) queryUri;
- (BOOL) queryUriIsSet;

- (TransportStation *) from;
- (void) setFrom: (TransportStation *) from;
- (BOOL) fromIsSet;

- (TransportStation *) via;
- (void) setVia: (TransportStation *) via;
- (BOOL) viaIsSet;

- (TransportStation *) to;
- (void) setTo: (TransportStation *) to;
- (BOOL) toIsSet;

- (NSString *) context;
- (void) setContext: (NSString *) context;
- (BOOL) contextIsSet;

- (NSArray *) connections;
- (void) setConnections: (NSArray *) connections;
- (BOOL) connectionsIsSet;

@end

@interface StationDepartures : NSObject <NSCoding> {
  TransportStation * __location;
  NSArray * __departures;
  NSArray * __lines;

  BOOL __location_isset;
  BOOL __departures_isset;
  BOOL __lines_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, retain, getter=location, setter=setLocation:) TransportStation * location;
@property (nonatomic, retain, getter=departures, setter=setDepartures:) NSArray * departures;
@property (nonatomic, retain, getter=lines, setter=setLines:) NSArray * lines;
#endif

- (id) initWithLocation: (TransportStation *) location departures: (NSArray *) departures lines: (NSArray *) lines;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (TransportStation *) location;
- (void) setLocation: (TransportStation *) location;
- (BOOL) locationIsSet;

- (NSArray *) departures;
- (void) setDepartures: (NSArray *) departures;
- (BOOL) departuresIsSet;

- (NSArray *) lines;
- (void) setLines: (NSArray *) lines;
- (BOOL) linesIsSet;

@end

@interface QueryDepartureResult : NSObject <NSCoding> {
  int __status;
  NSArray * __stationDepartures;

  BOOL __status_isset;
  BOOL __stationDepartures_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, getter=status, setter=setStatus:) int status;
@property (nonatomic, retain, getter=stationDepartures, setter=setStationDepartures:) NSArray * stationDepartures;
#endif

- (id) initWithStatus: (int) status stationDepartures: (NSArray *) stationDepartures;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (int) status;
- (void) setStatus: (int) status;
- (BOOL) statusIsSet;

- (NSArray *) stationDepartures;
- (void) setStationDepartures: (NSArray *) stationDepartures;
- (BOOL) stationDeparturesIsSet;

@end

@interface RailwayNode : NSObject <NSCoding> {
  NSDictionary * __tags_;
  int32_t __lat_;
  int32_t __lon_;
  int32_t __ref_;
  int32_t __num_;
  double __distFromPrevious_;
  int32_t __previousRef_;
  int32_t __uicRef_;

  BOOL __tags__isset;
  BOOL __lat__isset;
  BOOL __lon__isset;
  BOOL __ref__isset;
  BOOL __num__isset;
  BOOL __distFromPrevious__isset;
  BOOL __previousRef__isset;
  BOOL __uicRef__isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, retain, getter=tags_, setter=setTags_:) NSDictionary * tags_;
@property (nonatomic, getter=lat_, setter=setLat_:) int32_t lat_;
@property (nonatomic, getter=lon_, setter=setLon_:) int32_t lon_;
@property (nonatomic, getter=ref_, setter=setRef_:) int32_t ref_;
@property (nonatomic, getter=num_, setter=setNum_:) int32_t num_;
@property (nonatomic, getter=distFromPrevious_, setter=setDistFromPrevious_:) double distFromPrevious_;
@property (nonatomic, getter=previousRef_, setter=setPreviousRef_:) int32_t previousRef_;
@property (nonatomic, getter=uicRef_, setter=setUicRef_:) int32_t uicRef_;
#endif

- (id) initWithTags_: (NSDictionary *) tags_ lat_: (int32_t) lat_ lon_: (int32_t) lon_ ref_: (int32_t) ref_ num_: (int32_t) num_ distFromPrevious_: (double) distFromPrevious_ previousRef_: (int32_t) previousRef_ uicRef_: (int32_t) uicRef_;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (NSDictionary *) tags_;
- (void) setTags_: (NSDictionary *) tags_;
- (BOOL) tags_IsSet;

- (int32_t) lat_;
- (void) setLat_: (int32_t) lat_;
- (BOOL) lat_IsSet;

- (int32_t) lon_;
- (void) setLon_: (int32_t) lon_;
- (BOOL) lon_IsSet;

- (int32_t) ref_;
- (void) setRef_: (int32_t) ref_;
- (BOOL) ref_IsSet;

- (int32_t) num_;
- (void) setNum_: (int32_t) num_;
- (BOOL) num_IsSet;

- (double) distFromPrevious_;
- (void) setDistFromPrevious_: (double) distFromPrevious_;
- (BOOL) distFromPrevious_IsSet;

- (int32_t) previousRef_;
- (void) setPreviousRef_: (int32_t) previousRef_;
- (BOOL) previousRef_IsSet;

- (int32_t) uicRef_;
- (void) setUicRef_: (int32_t) uicRef_;
- (BOOL) uicRef_IsSet;

@end

@interface RailwayNd : NSObject <NSCoding> {
  int32_t __num;
  int32_t __ref;

  BOOL __num_isset;
  BOOL __ref_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, getter=num, setter=setNum:) int32_t num;
@property (nonatomic, getter=ref, setter=setRef:) int32_t ref;
#endif

- (id) initWithNum: (int32_t) num ref: (int32_t) ref;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (int32_t) num;
- (void) setNum: (int32_t) num;
- (BOOL) numIsSet;

- (int32_t) ref;
- (void) setRef: (int32_t) ref;
- (BOOL) refIsSet;

@end

@interface RailwayWay : NSObject <NSCoding> {
  NSSet * __nds;
  int32_t __num;

  BOOL __nds_isset;
  BOOL __num_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, retain, getter=nds, setter=setNds:) NSSet * nds;
@property (nonatomic, getter=num, setter=setNum:) int32_t num;
#endif

- (id) initWithNds: (NSSet *) nds num: (int32_t) num;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (NSSet *) nds;
- (void) setNds: (NSSet *) nds;
- (BOOL) ndsIsSet;

- (int32_t) num;
- (void) setNum: (int32_t) num;
- (BOOL) numIsSet;

@end

@interface RailwayMember : NSObject <NSCoding> {
  NSString * __type_;
  int32_t __ref_;
  NSString * __role_;
  int32_t __num_;

  BOOL __type__isset;
  BOOL __ref__isset;
  BOOL __role__isset;
  BOOL __num__isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, retain, getter=type_, setter=setType_:) NSString * type_;
@property (nonatomic, getter=ref_, setter=setRef_:) int32_t ref_;
@property (nonatomic, retain, getter=role_, setter=setRole_:) NSString * role_;
@property (nonatomic, getter=num_, setter=setNum_:) int32_t num_;
#endif

- (id) initWithType_: (NSString *) type_ ref_: (int32_t) ref_ role_: (NSString *) role_ num_: (int32_t) num_;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (NSString *) type_;
- (void) setType_: (NSString *) type_;
- (BOOL) type_IsSet;

- (int32_t) ref_;
- (void) setRef_: (int32_t) ref_;
- (BOOL) ref_IsSet;

- (NSString *) role_;
- (void) setRole_: (NSString *) role_;
- (BOOL) role_IsSet;

- (int32_t) num_;
- (void) setNum_: (int32_t) num_;
- (BOOL) num_IsSet;

@end

@interface Railway : NSObject <NSCoding> {
  NSDictionary * __nodes_;
  NSDictionary * __ways_;
  NSSet * __members_;
  NSSet * __railway_;
  NSDictionary * __stopNodes_;

  BOOL __nodes__isset;
  BOOL __ways__isset;
  BOOL __members__isset;
  BOOL __railway__isset;
  BOOL __stopNodes__isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, retain, getter=nodes_, setter=setNodes_:) NSDictionary * nodes_;
@property (nonatomic, retain, getter=ways_, setter=setWays_:) NSDictionary * ways_;
@property (nonatomic, retain, getter=members_, setter=setMembers_:) NSSet * members_;
@property (nonatomic, retain, getter=railway_, setter=setRailway_:) NSSet * railway_;
@property (nonatomic, retain, getter=stopNodes_, setter=setStopNodes_:) NSDictionary * stopNodes_;
#endif

- (id) initWithNodes_: (NSDictionary *) nodes_ ways_: (NSDictionary *) ways_ members_: (NSSet *) members_ railway_: (NSSet *) railway_ stopNodes_: (NSDictionary *) stopNodes_;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (NSDictionary *) nodes_;
- (void) setNodes_: (NSDictionary *) nodes_;
- (BOOL) nodes_IsSet;

- (NSDictionary *) ways_;
- (void) setWays_: (NSDictionary *) ways_;
- (BOOL) ways_IsSet;

- (NSSet *) members_;
- (void) setMembers_: (NSSet *) members_;
- (BOOL) members_IsSet;

- (NSSet *) railway_;
- (void) setRailway_: (NSSet *) railway_;
- (BOOL) railway_IsSet;

- (NSDictionary *) stopNodes_;
- (void) setStopNodes_: (NSDictionary *) stopNodes_;
- (BOOL) stopNodes_IsSet;

@end

@protocol TransportService <NSObject>
- (NSArray *) autocomplete: (NSString *) constraint;  // throws TException
- (NSArray *) getLocationsFromIDs: (NSArray *) ids;  // throws TException
- (NSArray *) getLocationsFromNames: (NSArray *) names;  // throws TException
- (QueryDepartureResult *) nextDepartures: (NSString *) IDStation;  // throws TException
- (QueryTripsResult *) getTrips: (NSString *) from : (NSString *) to;  // throws TException
- (QueryTripsResult *) getTripsAtTime: (NSString *) from : (NSString *) to : (timestamp) time : (BOOL) isDeparture;  // throws TException
- (QueryTripsResult *) getTripsFromStationsIDs: (NSString *) fromID : (NSString *) toID;  // throws TException
@end

@interface TransportServiceClient : NSObject <TransportService> {
  id <TProtocol> inProtocol;
  id <TProtocol> outProtocol;
}
- (id) initWithProtocol: (id <TProtocol>) protocol;
- (id) initWithInProtocol: (id <TProtocol>) inProtocol outProtocol: (id <TProtocol>) outProtocol;
@end

@interface TransportServiceProcessor : NSObject <TProcessor> {
  id <TransportService> mService;
  NSDictionary * mMethodMap;
}
- (id) initWithTransportService: (id <TransportService>) service;
- (id<TransportService>) service;
@end

@interface transportConstants : NSObject {
}
@end
