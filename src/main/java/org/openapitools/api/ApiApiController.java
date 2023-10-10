package org.openapitools.api;

import org.openapitools.model.AckTasks200Response;
import org.openapitools.model.AckTasksRequest;
import org.openapitools.model.BulkEditRequest;
import org.openapitools.model.CreateCorrespondentRequest;
import org.openapitools.model.CreateDocumentType200Response;
import org.openapitools.model.CreateGroupRequest;
import org.openapitools.model.CreateSavedViewsRequest;
import org.openapitools.model.CreateStoragePath200Response;
import org.openapitools.model.CreateStoragePathRequest;
import org.openapitools.model.CreateTag200Response;
import org.openapitools.model.CreateTagRequest;
import org.openapitools.model.CreateUISettings200Response;
import org.openapitools.model.CreateUISettingsRequest;
import org.openapitools.model.CreateUserRequest;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.model.GetCorrespondents200Response;
import org.openapitools.model.GetDocument200Response;
import org.openapitools.model.GetDocumentMetadata200Response;
import org.openapitools.model.GetDocumentSuggestions200Response;
import org.openapitools.model.GetDocumentTypes200Response;
import org.openapitools.model.GetDocuments200Response;
import org.openapitools.model.GetGroups200Response;
import org.openapitools.model.GetSavedViews200Response;
import org.openapitools.model.GetStoragePaths200Response;
import org.openapitools.model.GetTags200Response;
import org.openapitools.model.GetTasks200ResponseInner;
import org.openapitools.model.GetUISettings200Response;
import org.openapitools.model.GetUsers200Response;
import org.openapitools.model.GetUsers200ResponseResultsInner;
import java.time.OffsetDateTime;
import org.openapitools.model.SelectionData200Response;
import org.openapitools.model.SelectionDataRequest;
import org.openapitools.model.Statistics200Response;
import org.openapitools.model.UpdateCorrespondent200Response;
import org.openapitools.model.UpdateCorrespondentRequest;
import org.openapitools.model.UpdateDocument200Response;
import org.openapitools.model.UpdateDocumentRequest;
import org.openapitools.model.UpdateDocumentType200Response;
import org.openapitools.model.UpdateDocumentTypeRequest;
import org.openapitools.model.UpdateGroup200Response;
import org.openapitools.model.UpdateGroupRequest;
import org.openapitools.model.UpdateStoragePath200Response;
import org.openapitools.model.UpdateStoragePathRequest;
import org.openapitools.model.UpdateTag200Response;
import org.openapitools.model.UpdateTagRequest;
import org.openapitools.model.UpdateUserRequest;
import org.openapitools.model.UserInfo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-10T06:36:40.060738Z[Etc/UTC]")
@Controller
@RequestMapping("${openapi.paperlessRestServer.base-path:}")
@CrossOrigin(origins = "http://localhost:8080")
public class ApiApiController implements ApiApi {

    private final NativeWebRequest request;

    @Autowired
    public ApiApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
