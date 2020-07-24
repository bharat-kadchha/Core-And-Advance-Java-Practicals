### java8DateAndTimeStore :
    
- java8 provide following packages for the handle Date and Time .  
    - Local : 
      - simplified date time API. classes like . `LocalTime`,`LocalDateTime`,`DateTimeFormatter`,`offsetDate`; 
      - you want to store timestamp then go with LocalDataTime, for Date only then go with LocalDate;
      ```
        LocalDateTime current = LocalDateTime.now(); 
        LocalDate date = LocalDate.now(); 
      ```
    - Zoned : 
      - for the use time zones with their id , `ZoneId`,`ZoneDateTime`;
      ```
        ZonedDateTime currentZone = ZonedDateTime.now();
        ZoneId tokyo = ZoneId.of("Asia/Kolkata"); 
      ```