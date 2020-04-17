INSERT INTO public.answer (id, inspiration_points, knowledge_points, time_points, value) VALUES (1, 2, 0, 3,  ' Позову знакомых, в которых уверен(а)');
INSERT INTO public.answer (id, inspiration_points, knowledge_points, time_points, value) VALUES (2, 5, 0,2,  ' Выложу объявление о наборе команды и отберу самых сильнейших ');
INSERT INTO public.answer (id, inspiration_points, knowledge_points, time_points, value) VALUES (3, -3, 0,-5,  ' Наберу рандомных людей, чтобы пройти минимальный лимит на количество участников в команде');

INSERT INTO public.answer (id, inspiration_points, knowledge_points, time_points, value) VALUES (4, 3, 4,-2,  ' Нет деления, все равны');
INSERT INTO public.answer (id, inspiration_points, knowledge_points, time_points, value) VALUES (5, 3, 3,0,  ' Есть ярко выраженный лидер и остальные');
INSERT INTO public.answer (id, inspiration_points, knowledge_points, time_points, value) VALUES (6, 5, 3, 3, ' Деление по зонам ответственности');

INSERT INTO public.answer (id, inspiration_points, knowledge_points, time_points, value) VALUES (7, 4, 3, -3, ' Очные встречи для всех участников');
INSERT INTO public.answer (id, inspiration_points, knowledge_points, time_points, value) VALUES (8, 2, 1, -2, ' Заочные встречи в Скайпе');
INSERT INTO public.answer (id, inspiration_points, knowledge_points, time_points, value) VALUES (9, -2, 5, -1, ' Не организовывать встречи вовсе, вести систематическую отчетность в письменном виде');

INSERT INTO public.answer (id, inspiration_points, knowledge_points, time_points, value) VALUES (10, 3, 1, -2, ' Устроить тренинг по командообразованию');
INSERT INTO public.answer (id, inspiration_points, knowledge_points, time_points, value) VALUES (11, 10, 0, 10, ' Арендовать офис');
INSERT INTO public.answer (id, inspiration_points, knowledge_points, time_points, value) VALUES (12, 5, 3, -4, ' Посетить конференцию по разработке');

INSERT INTO public.answer (id, inspiration_points, knowledge_points, time_points, value) VALUES (13, 3, 2,0,  ' Да, пусть участники каждый день рассказывают, что сделали за вчерашний день ');
INSERT INTO public.answer (id, inspiration_points, knowledge_points, time_points, value) VALUES (14, -3, 1, 0, ' Нет, это бесполезно');

INSERT INTO public.answer (id, inspiration_points, knowledge_points, time_points, value) VALUES (15, 5, 5, 5, ' Одно из: XP, Scrum, Lean, Kanban');
INSERT INTO public.answer (id, inspiration_points, knowledge_points, time_points, value) VALUES (16, -4, 2, -3, ' Участники сами выбирают, чем будут заниматься');

INSERT INTO public.answer (id, inspiration_points, knowledge_points, time_points, value) VALUES (17, -1, 2, -3, ' Взять накопленный за годы практики опыт из собственной головы и рассказать участникам команды всё, что знаю сам');
INSERT INTO public.answer (id, inspiration_points, knowledge_points, time_points, value) VALUES (18, -3, 10, -8, ' Предоставить ребят самим себе, чтобы методом проб и ошибок добирались до нужного результата, изобретали велосипед');
INSERT INTO public.answer (id, inspiration_points, knowledge_points, time_points, value) VALUES (19, 2, 3, -4, ' Изучать материалы в интернете, читать статьи и пробовать применять примеры на практике');

INSERT INTO public.answer (id, inspiration_points, knowledge_points, time_points, value) VALUES (20, 0, -1, -4, ' Попробую договориться с администрацией и зарегистрирую знакомого программиста, который согласился помочь');
INSERT INTO public.answer (id, inspiration_points, knowledge_points, time_points, value) VALUES (21, -2, -2, -1, ' Проведу мотивационную речь, чтобы поднять моральный дух команды и уверить их, что без Васи всё прекрасно обойдётся');

INSERT INTO public.answer (id, inspiration_points, knowledge_points, time_points, value) VALUES (22, 3, 2, 0, ' Деньги. N-ную сумму каждому, если принесут победу');
INSERT INTO public.answer (id, inspiration_points, knowledge_points, time_points, value) VALUES (23, 5, 2, 1, ' Разделить выигрыш между всеми');
INSERT INTO public.answer (id, inspiration_points, knowledge_points, time_points, value) VALUES (24, 3, -2, 4, ' Подписку на платный курс по веб-разработке');

INSERT INTO public.coach (id, inspiration_points, knowledge_points, time_points, name) VALUES (16, 10, 20, 30, 'test');
INSERT INTO public.coach (id, inspiration_points, knowledge_points, time_points, name) VALUES (17, 12, 21, 28, 'marina');

INSERT INTO public.question (id, text) VALUES (1, 'Какими правилами вы будете руководствоваться при отборе участников команды?');
INSERT INTO public.question (id, text) VALUES (2, 'Как будут распределены роли в команде?');
INSERT INTO public.question (id, text) VALUES (3, 'Какой формат подготовительных встреч выберете для команды?');
INSERT INTO public.question (id, text) VALUES (4, 'Какой вариант совместного времяпрепровождения выберете?');
INSERT INTO public.question (id, text) VALUES (5, 'Будут ли ежедневные созвоны?');
INSERT INTO public.question (id, text) VALUES (6, 'Какую методологию подготовки/разработки вы будете использовать?');
INSERT INTO public.question (id, text) VALUES (7, 'Какой ресурс, сборник информации выберете для изучения командой?');
INSERT INTO public.question (id, text) VALUES (8, 'Как поступите, если один из участников откажется участвовать/заболеет и не сможет принять участие за день до начала хакатона?');
INSERT INTO public.question (id, text) VALUES (9, 'Какую награду пообещаете в случае выигрыша?');

INSERT INTO public.question_answer (question_id, answer_id) VALUES (1, 1);
INSERT INTO public.question_answer (question_id, answer_id) VALUES (1, 2);
INSERT INTO public.question_answer (question_id, answer_id) VALUES (1, 3);

INSERT INTO public.question_answer (question_id, answer_id) VALUES (2, 4);
INSERT INTO public.question_answer (question_id, answer_id) VALUES (2, 5);
INSERT INTO public.question_answer (question_id, answer_id) VALUES (2, 6);

INSERT INTO public.question_answer (question_id, answer_id) VALUES (3, 7);
INSERT INTO public.question_answer (question_id, answer_id) VALUES (3, 8);
INSERT INTO public.question_answer (question_id, answer_id) VALUES (3, 9);

INSERT INTO public.question_answer (question_id, answer_id) VALUES (4, 10);
INSERT INTO public.question_answer (question_id, answer_id) VALUES (4, 11);
INSERT INTO public.question_answer (question_id, answer_id) VALUES (4, 12);

INSERT INTO public.question_answer (question_id, answer_id) VALUES (5, 13);
INSERT INTO public.question_answer (question_id, answer_id) VALUES (5, 14);

INSERT INTO public.question_answer (question_id, answer_id) VALUES (6, 15);
INSERT INTO public.question_answer (question_id, answer_id) VALUES (6, 16);

INSERT INTO public.question_answer (question_id, answer_id) VALUES (7, 17);
INSERT INTO public.question_answer (question_id, answer_id) VALUES (7, 18);
INSERT INTO public.question_answer (question_id, answer_id) VALUES (7, 19);

INSERT INTO public.question_answer (question_id, answer_id) VALUES (8, 20);
INSERT INTO public.question_answer (question_id, answer_id) VALUES (8, 21);

INSERT INTO public.question_answer (question_id, answer_id) VALUES (9, 22



);
INSERT INTO public.question_answer (question_id, answer_id) VALUES (9, 23);
INSERT INTO public.question_answer (question_id, answer_id) VALUES (9, 24);