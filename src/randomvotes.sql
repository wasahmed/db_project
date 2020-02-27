CREATE DEFINER=`root`@`localhost` PROCEDURE `new_procedure`(in Party varchar(15), in NumberOfVotesAndUsersToAdd int)
BEGIN
	declare IdNo varchar(13);
    declare Name varchar(20);
    declare count int;
    declare loopLimit int;
    set loopLimit = NumberOfVotesAndUsersToAdd;
    TestItt: Loop
		if (count < loopLimit) then
			leave TestItt;
		End if;
        INSERT INTO `voting`.`user`
		(`Firstname`,
		`Surname`,
		`Id_Number`,
		`Gender`,
		`Race`,
		`Province`)
		VALUES
		(GetRandomName(),
		"Test",
		convert (floor(rand() * 9999999999999), char(13)),
		"Test",
		"Test",
		"Test");
        INSERT INTO `voting`.`votes`
		(`Party`,
		`User_Id`)
		VALUES
		(party,
		last_insert_id());
        set count = count + 1;
        
    End loop;
END