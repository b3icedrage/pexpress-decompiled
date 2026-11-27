package defpackage;

import com.api.core.backend.domain.models.requestModels.AddDealRequest;
import com.api.core.backend.domain.models.requestModels.ConfigRequest;
import com.api.core.backend.domain.models.responseModels.ConfigResponse;
import com.api.core.backend.domain.models.responseModels.CountriesLocalizedResponse;
import com.api.core.backend.domain.models.responseModels.DefaultResponse;
import com.api.core.backend.domain.models.responseModels.GetVPNResponse;
import com.api.core.backend.domain.models.responseModels.KnowledgeBaseValuesResponse;
import com.api.core.backend.repositories.user.models.requests.AccountActivationRequest;
import com.api.core.backend.repositories.user.models.requests.AddUserRequest;
import com.api.core.backend.repositories.user.models.requests.ChangeChangeUserDataRequest;
import com.api.core.backend.repositories.user.models.requests.CryptoEnableRequest;
import com.api.core.backend.repositories.user.models.requests.GetUserDataRequest;
import com.api.core.backend.repositories.user.models.responses.CommonShortUserResponse;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ua1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0012\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0019\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001b\u0010\u001cJ$\u0010\u001f\u001a\u00020\u001e2\b\b\u0001\u0010\u0017\u001a\u00020\u001d2\b\b\u0001\u0010\u0019\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u001e2\b\b\u0001\u0010\u0017\u001a\u00020!H§@¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u001e2\b\b\u0001\u0010\u0017\u001a\u00020$H§@¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u001e2\b\b\u0001\u0010\u0017\u001a\u00020'H§@¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u001e2\b\b\u0001\u0010\u0017\u001a\u00020*H§@¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\b\u0001\u0010-\u001a\u00020\u0007H§@¢\u0006\u0004\b/\u0010\u0015¨\u00060"}, d2 = {"Lua1;", "", "Lcom/api/core/backend/domain/models/requestModels/ConfigRequest;", "commonConfigRequest", "Lcom/api/core/backend/domain/models/responseModels/ConfigResponse;", "e", "(Lcom/api/core/backend/domain/models/requestModels/ConfigRequest;LJM;)Ljava/lang/Object;", "", ImagesContract.URL, "LGp0;", "timeouts", "LEt1;", "LGt1;", "g", "(Ljava/lang/String;LGp0;LJM;)Ljava/lang/Object;", "Lcom/api/core/backend/domain/models/responseModels/GetVPNResponse;", "d", "(LJM;)Ljava/lang/Object;", "locale", "Lcom/api/core/backend/domain/models/responseModels/CountriesLocalizedResponse;", "h", "(Ljava/lang/String;LJM;)Ljava/lang/Object;", "Lcom/api/core/backend/repositories/user/models/requests/GetUserDataRequest;", "request", "Lxq0;", "recorder", "Lcom/api/core/backend/repositories/user/models/responses/CommonShortUserResponse;", "k", "(Lcom/api/core/backend/repositories/user/models/requests/GetUserDataRequest;Lxq0;LJM;)Ljava/lang/Object;", "Lcom/api/core/backend/repositories/user/models/requests/AddUserRequest;", "Lcom/api/core/backend/domain/models/responseModels/DefaultResponse;", "b", "(Lcom/api/core/backend/repositories/user/models/requests/AddUserRequest;Lxq0;LJM;)Ljava/lang/Object;", "Lcom/api/core/backend/repositories/user/models/requests/AccountActivationRequest;", R51.PUSH_ADDITIONAL_DATA_KEY, "(Lcom/api/core/backend/repositories/user/models/requests/AccountActivationRequest;LJM;)Ljava/lang/Object;", "Lcom/api/core/backend/repositories/user/models/requests/CryptoEnableRequest;", "c", "(Lcom/api/core/backend/repositories/user/models/requests/CryptoEnableRequest;LJM;)Ljava/lang/Object;", "Lcom/api/core/backend/repositories/user/models/requests/ChangeChangeUserDataRequest;", "i", "(Lcom/api/core/backend/repositories/user/models/requests/ChangeChangeUserDataRequest;LJM;)Ljava/lang/Object;", "Lcom/api/core/backend/domain/models/requestModels/AddDealRequest;", "j", "(Lcom/api/core/backend/domain/models/requestModels/AddDealRequest;LJM;)Ljava/lang/Object;", "accountType", "Lcom/api/core/backend/domain/models/responseModels/KnowledgeBaseValuesResponse;", "f", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface InterfaceC7007ua1 {
    @InterfaceC2288Wa1("/v1/user/activation")
    @Nullable
    Object a(@InterfaceC5396mt @NotNull AccountActivationRequest accountActivationRequest, @NotNull JM<? super DefaultResponse> jm);

    @InterfaceC2288Wa1("/v1/user")
    @Nullable
    Object b(@InterfaceC5396mt @NotNull AddUserRequest addUserRequest, @InterfaceC4686jX1 @NotNull C7698xq0 c7698xq0, @NotNull JM<? super DefaultResponse> jm);

    @InterfaceC2288Wa1("/v1/user/crypto-enable")
    @Nullable
    Object c(@InterfaceC5396mt @NotNull CryptoEnableRequest cryptoEnableRequest, @NotNull JM<? super DefaultResponse> jm);

    @InterfaceC2206Va1("/v1/vpn")
    @Nullable
    Object d(@NotNull JM<? super GetVPNResponse> jm);

    @InterfaceC2206Va1("/v1/")
    @Nullable
    Object e(@InterfaceC5396mt @Nullable ConfigRequest configRequest, @NotNull JM<? super ConfigResponse> jm);

    @InterfaceC4734jk0("/v1/knowledge")
    @Nullable
    Object f(@InterfaceC8102zl1("type") @NotNull String str, @NotNull JM<? super KnowledgeBaseValuesResponse> jm);

    @InterfaceC4734jk0
    @InterfaceC3154cS1
    @Nullable
    Object g(@Ka2 @NotNull String str, @InterfaceC4686jX1 @NotNull C1078Gp0 c1078Gp0, @NotNull JM<? super C0935Et1<AbstractC1091Gt1>> jm);

    @InterfaceC4734jk0("/v1/country/localized")
    @Nullable
    Object h(@InterfaceC8102zl1("locale") @NotNull String str, @NotNull JM<? super CountriesLocalizedResponse> jm);

    @InterfaceC2288Wa1("/v1/user/edit")
    @Nullable
    Object i(@InterfaceC5396mt @NotNull ChangeChangeUserDataRequest changeChangeUserDataRequest, @NotNull JM<? super DefaultResponse> jm);

    @InterfaceC2288Wa1("/v1/deal")
    @Nullable
    Object j(@InterfaceC5396mt @NotNull AddDealRequest addDealRequest, @NotNull JM<? super DefaultResponse> jm);

    @InterfaceC2206Va1("/v1/user")
    @Nullable
    Object k(@InterfaceC5396mt @NotNull GetUserDataRequest getUserDataRequest, @InterfaceC4686jX1 @NotNull C7698xq0 c7698xq0, @NotNull JM<? super CommonShortUserResponse> jm);
}
