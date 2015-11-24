/*
 *  Copyright 2015 Institute of Information Systems, Hof University
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */
package de.hofuniversity.iisys.neo4j.websock.shindig;

/**
 * Collection of constants, naming parameters, methods and query names for the server's native
 * Shindig-related routines.
 */
public class ShindigNativeQueries {
  // general parameters
  public static final String USER_ID = "userId";
  public static final String USER_ID_LIST = "userIds";
  public static final String GROUP_ID = "groupId";
  public static final String APP_ID = "appId";
  public static final String OPTIONS_MAP = "$OPTIONS";
  public static final String FIELD_LIST = "fields";
  public static final String AUTOCOMPLETE_FRAGMENT = "fragment";

  // person service methods
  public static final String PERSON_OBJECT = "person";

  public static final String GET_PEOPLE_QUERY = "getPeople";
  public static final String GET_PEOPLE_METHOD = "getPeople";

  public static final String GET_PERSON_QUERY = "getPerson";
  public static final String GET_PERSON_METHOD = "getPerson";

  public static final String UPDATE_PERSON_QUERY = "updatePerson";
  public static final String UPDATE_PERSON_METHOD = "updatePerson";

  public static final String GET_ALL_PEOPLE_QUERY = "getAllPeople";
  public static final String GET_ALL_PEOPLE_METHOD = "getAllPeople";

  public static final String CREATE_PERSON_QUERY = "createPerson";
  public static final String CREATE_PERSON_METHOD = "createPerson";

  public static final String DELETE_PERSON_QUERY = "deletePerson";
  public static final String DELETE_PERSON_METHOD = "deletePerson";

  // friend service methods
  public static final String GET_FRIEND_REQUESTS_QUERY = "getFriendRequests";
  public static final String GET_FRIEND_REQUESTS_METHOD = "getRequests";

  public static final String REQUEST_FRIENDSHIP_QUERY = "requestFriendship";
  public static final String REQUEST_FRIENDSHIP_METHOD = "requestFriendship";

  public static final String DENY_FRIENDSHIP_QUERY = "denyFriendship";
  public static final String DENY_FRIENDSHIP_METHOD = "denyFriendship";

  // group service methods
  public static final String GET_GROUPS_QUERY = "getGroups";
  public static final String GET_GROUPS_METHOD = "getGroups";

  // graph service methods
  public static final String GET_FOFS_QUERY = "getFriendsOfFriends";
  public static final String GET_FOFS_METHOD = "getFriendsOfFriends";
  public static final String FOF_DEPTH = "depth";
  public static final String FOF_UNKNOWN = "unknown";

  public static final String GET_SHORTEST_PATH_QUERY = "getShortestPath";
  public static final String GET_SHORTEST_PATH_METHOD = "getShortestPath";
  public static final String TARGET_USER_ID = "target";

  public static final String RECOMMEND_GROUP_QUERY = "getGroupRecommendation";
  public static final String RECOMMEND_GROUP_METHOD = "getGroupRecommendation";
  public static final String MIN_FRIENDS_IN_GROUP = "minFriendsInGroup";

  public static final String RECOMMEND_FRIEND_QUERY = "getFriendRecommendation";
  public static final String RECOMMEND_FRIEND_METHOD = "getFriendRecommendation";
  public static final String MIN_COMMON_FRIENDS = "minCommonFriends";

  // activity stream service methods
  public static final String GET_ACT_ENTRIES_QUERY = "getActivityEntries";
  public static final String GET_ACT_ENTRIES_METHOD = "getActivityEntries";

  public static final String GET_ACT_ENTRIES_BY_ID_QUERY = "getActivityEntriesById";
  public static final String GET_ACT_ENTRIES_BY_ID_METHOD = "getActivityEntries";
  public static final String ACTIVITY_IDS = "activityIds";

  public static final String GET_ACT_ENTRY_QUERY = "getActivityEntry";
  public static final String GET_ACT_ENTRY_METHOD = "getActivityEntry";
  public static final String ACTIVITY_ID = "activityId";

  public static final String DELETE_ACT_ENTRIES_QUERY = "deleteActivityEntries";
  public static final String DELETE_ACT_ENTRIES_METHOD = "deleteActivityEntries";

  public static final String UPDATE_ACT_ENTRY_QUERY = "updateActivityEntry";
  public static final String UPDATE_ACT_ENTRY_METHOD = "updateActivityEntry";

  public static final String CREATE_ACT_ENTRY_QUERY = "createActivityEntry";
  public static final String CREATE_ACT_ENTRY_METHOD = "createActivityEntry";
  public static final String ACTIVITY_ENTRY_OBJECT = "activityEntry";

  // application data service methods
  public static final String GET_APP_DATA_QUERY = "getAppData";
  public static final String GET_APP_DATA_METHOD = "getPersonData";

  public static final String DELETE_APP_DATA_QUERY = "deleteAppData";
  public static final String DELETE_APP_DATA_METHOD = "deletePersonData";

  public static final String UPDATE_APP_DATA_QUERY = "updateAppData";
  public static final String UPDATE_APP_DATA_METHOD = "updatePersonData";
  public static final String APP_DATA = "appData";

  // message service methods
  public static final String MESSAGE_COLLECTION_ID = "messCollId";
  public static final String MESSAGE_COLLECTION_OBJECT = "messageCollection";
  public static final String MESSAGE_ID = "messageId";
  public static final String MESSAGE_ID_LIST = "messageIds";
  public static final String MESSAGE_OBJECT = "message";

  public static final String GET_MESSAGE_COLLECTIONS_QUERY = "getMessageCollections";
  public static final String GET_MESSAGE_COLLECTIONS_METHOD = "getMessageCollections";

  public static final String CREATE_MESS_COLL_QUERY = "createMessageCollection";
  public static final String CREATE_MESS_COLL_METHOD = "createMessageCollection";

  public static final String MODIFY_MESS_COLL_QUERY = "modifyMessageCollection";
  public static final String MODIFY_MESS_COLL_METHOD = "modifyMessageCollection";

  public static final String DELETE_MESS_COLL_QUERY = "deleteMessageCollection";
  public static final String DELETE_MESS_COLL_METHOD = "deleteMessageCollection";

  public static final String GET_MESSAGES_QUERY = "getMessages";
  public static final String GET_MESSAGES_METHOD = "getMessages";

  public static final String CREATE_MESSAGE_QUERY = "createMessage";
  public static final String CREATE_MESSAGE_METHOD = "createMessage";

  public static final String DELETE_MESSAGES_QUERY = "deleteMessages";
  public static final String DELETE_MESSAGES_METHOD = "deleteMessages";

  public static final String MODIFY_MESSAGE_QUERY = "modifyMessage";
  public static final String MODIFY_MESSAGE_METHOD = "modifyMessage";

  // album service methods
  public static final String ALBUM_ID = "albumId";
  public static final String ALBUM_ID_LIST = "albumIds";
  public static final String ALBUM_OBJECT = "album";

  public static final String GET_ALBUM_QUERY = "getAlbum";
  public static final String GET_ALBUM_METHOD = "getAlbum";

  public static final String GET_ALBUMS_QUERY = "getAlbums";
  public static final String GET_ALBUMS_METHOD = "getAlbums";

  public static final String GET_GROUP_ALBUMS_QUERY = "getGroupAlbums";
  public static final String GET_GROUP_ALBUMS_METHOD = "getAlbums";

  public static final String DELETE_ALBUM_QUERY = "deleteAlbum";
  public static final String DELETE_ALBUM_METHOD = "deleteAlbum";

  public static final String CREATE_ALBUM_QUERY = "createAlbum";
  public static final String CREATE_ALBUM_METHOD = "createAlbum";

  public static final String UPDATE_ALBUM_QUERY = "updateAlbum";
  public static final String UPDATE_ALBUM_METHOD = "updateAlbum";

  // media item service methods
  public static final String MEDIA_ITEM_ID = "mediaItemId";
  public static final String MEDIA_ITEM_ID_LIST = "mediaItemIds";
  public static final String MEDIA_ITEM_OBJECT = "mediaItem";

  public static final String GET_MEDIA_ITEM_QUERY = "getMediaItem";
  public static final String GET_MEDIA_ITEM_METHOD = "getMediaItem";

  public static final String GET_MEDIA_ITEMS_BY_ID_QUERY = "getMediaItemsById";
  public static final String GET_MEDIA_ITEMS_BY_ID_METHOD = "getMediaItems";

  public static final String GET_MEDIA_ITEMS_QUERY = "getMediaItems";
  public static final String GET_MEDIA_ITEMS_METHOD = "getMediaItems";

  public static final String GET_GROUP_MEDIA_ITEMS_QUERY = "getGroupMediaItems";
  public static final String GET_GROUP_MEDIA_ITEMS_METHOD = "getMediaItems";

  public static final String DELETE_MEDIA_ITEM_QUERY = "deleteMediaItem";
  public static final String DELETE_MEDIA_ITEM_METHOD = "deleteMediaItem";

  public static final String CREATE_MEDIA_ITEM_QUERY = "createMediaItem";
  public static final String CREATE_MEDIA_ITEM_METHOD = "createMediaItem";

  public static final String UPDATE_MEDIA_ITEM_QUERY = "updateMediaItem";
  public static final String UPDATE_MEDIA_ITEM_METHOD = "updateMediaItem";

  // skill service methods
  public static final String SKILL = "skill";
  public static final String SKILL_LINKER = "linker";

  public static final String GET_SKILL_AUTOCOMPLETION_QUERY = "getSkillAutocompletion";
  public static final String GET_SKILL_AUTOCOMPLETION_METHOD = "getSkillAutocomp";

  public static final String GET_SKILLS_QUERY = "getSkills";
  public static final String GET_SKILLS_METHOD = "getSkills";

  public static final String ADD_SKILL_QUERY = "addSkill";
  public static final String ADD_SKILL_METHOD = "addSkill";

  public static final String REMOVE_SKILL_QUERY = "removeSkill";
  public static final String REMOVE_SKILL_METHOD = "removeSkill";

  public static final String GET_PEOPLE_BY_SKILL_QUERY = "getPeopleBySkill";
  public static final String GET_PEOPLE_BY_SKILL_METHOD = "getPeopleBySkill";
}
