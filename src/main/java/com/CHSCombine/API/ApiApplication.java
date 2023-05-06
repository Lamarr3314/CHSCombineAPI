package com.CHSCombine.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }
    //SQL procedure to tally all the scores every user
	/*
	DROP PROCEDURE IF EXISTS sum_user_scores;
Delimiter ;;
CREATE PROCEDURE `sum_user_scores`()

BEGIN
    DECLARE done INT DEFAULT FALSE;
    DECLARE userId INT;
    DECLARE total_score INT DEFAULT 0;
    DECLARE game_score INT;

    -- Declare cursor for looping through users
    DECLARE user_cursor CURSOR FOR SELECT id FROM user_table;

    -- Declare exit handler
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;

    -- Open the cursor
    OPEN user_cursor;

    -- Loop through the users
    user_loop: LOOP
        FETCH user_cursor INTO userId;
        IF done THEN
            LEAVE user_loop;
        END IF;

        -- Reset the total score for this user
        SET total_score = 0;

SELECT
    SUM(score)
INTO total_score FROM
    game_table
WHERE
    user_id = userId;

UPDATE user_table
SET
    score = total_score
WHERE
    id = userId;

    END LOOP;

    -- Close the user cursor
    CLOSE user_cursor;
END

	*/
}
