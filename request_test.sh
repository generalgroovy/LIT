#!/bin/bash

curl -i -H "Content-Type: application/json"  -d "{  \"type\": \"Create\", \
                                                    \"@context\": \"https://www.w3.org/ns/activitystreams\", \
                                                    \"actor\": \"https://social.example/alyssa/alyssa\",  \
                                                    \"id\": \"https://social.example/alyssa/posts/a29a6843-9feb-4c74-a7f7-081b9c9201d3\", \
                                                    \"to\": [ \"https://chatty.example/ben/\", \"https://chatty.example/john/\" ], \
                                                    \"object\": \"{ type: Note, \
                                                                    id: https://social.example/alyssa/posts/49e2d03d-b53a-4c4c-a95c-94a6abf45a19, \
                                                                    attributedTo: https://social.example/alyssa/, \
                                                                    to: [ https://chatty.example/ben/ ], \
                                                                    content: Say, did you finish reading that book I lent you?}\", \
                                                    \"target\": \"val\", \
                                                    \"result\": \"val\", \
                                                    \"origin\": \"val\", \
                                                    \"instrument\": \"val\"}" -X POST "http://localhost:8080/john/inbox"
