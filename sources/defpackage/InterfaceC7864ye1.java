package defpackage;

import com.google.android.gms.common.internal.ImagesContract;
import com.impl.core.backend.modelsResponse.RecoverPasswordResponse;
import com.impl.core.backend.responseModels.AuthorizationResponseImpl;
import com.impl.core.backend.responseModels.GetBalanceResponseImpl;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ye1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J¤\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u00022\b\b\u0003\u0010\u000e\u001a\u00020\r2\b\b\u0003\u0010\u000f\u001a\u00020\r2\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0007\u0010\u0014JL\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u00022\b\b\u0003\u0010\u000f\u001a\u00020\r2\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0018\u0010\u0019J\u0090\u0001\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0003\u0010\u000f\u001a\u00020\r2\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u001a\u0010\u001bJp\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0003\u0010\u001c\u001a\u00020\r2\b\b\u0003\u0010\u0015\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0003\u0010\u000f\u001a\u00020\r2\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u001d\u0010\u001eJ$\u0010!\u001a\u00020 2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u001f\u001a\u00020\u0002H§@¢\u0006\u0004\b!\u0010\"J4\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u001f\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b$\u0010%J.\u0010)\u001a\u00020#2\b\b\u0001\u0010&\u001a\u00020\u00022\b\b\u0001\u0010'\u001a\u00020\u00022\b\b\u0003\u0010(\u001a\u00020\u0002H§@¢\u0006\u0004\b)\u0010*J.\u0010,\u001a\u00020 2\b\b\u0001\u0010&\u001a\u00020\u00022\b\b\u0001\u0010+\u001a\u00020\r2\b\b\u0001\u0010\u001f\u001a\u00020\u0002H§@¢\u0006\u0004\b,\u0010-J$\u0010/\u001a\u00020.2\b\b\u0001\u0010&\u001a\u00020\u00022\b\b\u0001\u0010\u001f\u001a\u00020\u0002H§@¢\u0006\u0004\b/\u0010\"J*\u00100\u001a\b\u0012\u0004\u0012\u00020#0\u00122\b\b\u0001\u0010&\u001a\u00020\u00022\b\b\u0001\u0010\u001f\u001a\u00020\u0002H§@¢\u0006\u0004\b0\u0010\"¨\u00061"}, d2 = {"Lye1;", "", "", "fullPath", "utmCampaign", "utmSource", "utmMedium", R51.PUSH_ADDITIONAL_DATA_KEY, "ac", "code", "email", "password", "confirmPassword", "", "rules", "submitLogin", "Lxq0;", "recorder", "LEt1;", "Lcom/impl/core/backend/responseModels/AuthorizationResponseImpl;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILxq0;LJM;)Ljava/lang/Object;", "captcha", "captchas", "Lcom/impl/core/backend/modelsResponse/RecoverPasswordResponse;", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILxq0;LJM;)Ljava/lang/Object;", "i", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILxq0;LJM;)Ljava/lang/Object;", "remember", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILxq0;LJM;)Ljava/lang/Object;", "token", "", "e", "(Ljava/lang/String;Ljava/lang/String;LJM;)Ljava/lang/Object;", "LGt1;", "j", "(Ljava/lang/String;Ljava/lang/String;Lxq0;LJM;)Ljava/lang/Object;", ImagesContract.URL, "cookies", "width", "h", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LJM;)Ljava/lang/Object;", "balance", "b", "(Ljava/lang/String;ILjava/lang/String;LJM;)Ljava/lang/Object;", "Lcom/impl/core/backend/responseModels/GetBalanceResponseImpl;", "c", "f", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface InterfaceC7864ye1 {
    @InterfaceC0976Fh0
    @InterfaceC2206Va1("{fullPath}")
    @Nullable
    Object a(@InterfaceC0884Ec1(encoded = true, value = "fullPath") @NotNull String str, @InterfaceC8102zl1(encoded = true, value = "utm_campaign") @Nullable String str2, @InterfaceC8102zl1(encoded = true, value = "utm_source") @Nullable String str3, @InterfaceC8102zl1(encoded = true, value = "utm_medium") @Nullable String str4, @InterfaceC8102zl1(encoded = true, value = R51.PUSH_ADDITIONAL_DATA_KEY) @Nullable String str5, @InterfaceC8102zl1(encoded = true, value = "ac") @Nullable String str6, @InterfaceC8102zl1(encoded = true, value = "code") @Nullable String str7, @InterfaceC5965pc0("email") @NotNull String str8, @InterfaceC5965pc0("password") @NotNull String str9, @InterfaceC5965pc0("confirm-password") @NotNull String str10, @InterfaceC5965pc0("rules") int i, @InterfaceC5965pc0("submitLogin") int i2, @InterfaceC4686jX1 @NotNull C7698xq0 c7698xq0, @NotNull JM<? super C0935Et1<AuthorizationResponseImpl>> jm);

    @InterfaceC0976Fh0
    @InterfaceC2206Va1
    @Nullable
    Object b(@Ka2 @NotNull String str, @InterfaceC5965pc0("balance") int i, @InterfaceC5965pc0("token") @NotNull String str2, @NotNull JM<? super Unit> jm);

    @InterfaceC4734jk0
    @Nullable
    Object c(@Ka2 @NotNull String str, @InterfaceC8102zl1("token") @NotNull String str2, @NotNull JM<? super GetBalanceResponseImpl> jm);

    @InterfaceC0976Fh0
    @InterfaceC2206Va1("{fullPath}")
    @Nullable
    Object d(@InterfaceC0884Ec1(encoded = true, value = "fullPath") @NotNull String str, @InterfaceC5965pc0("email") @NotNull String str2, @InterfaceC5965pc0("token") @NotNull String str3, @InterfaceC5965pc0("g-recaptcha-response") @NotNull String str4, @InterfaceC5965pc0("submitLogin") int i, @InterfaceC4686jX1 @NotNull C7698xq0 c7698xq0, @NotNull JM<? super RecoverPasswordResponse> jm);

    @InterfaceC0976Fh0
    @InterfaceC2206Va1("{fullPath}")
    @Nullable
    Object e(@InterfaceC0884Ec1(encoded = true, value = "fullPath") @NotNull String str, @InterfaceC5965pc0("token") @NotNull String str2, @NotNull JM<? super Unit> jm);

    @InterfaceC4734jk0
    @Nullable
    Object f(@Ka2 @NotNull String str, @InterfaceC8102zl1("token") @NotNull String str2, @NotNull JM<? super C0935Et1<AbstractC1091Gt1>> jm);

    @InterfaceC0976Fh0
    @InterfaceC2206Va1("{fullPath}")
    @Nullable
    Object g(@InterfaceC0884Ec1(encoded = true, value = "fullPath") @NotNull String str, @InterfaceC5965pc0("email") @NotNull String str2, @InterfaceC5965pc0("password") @NotNull String str3, @InterfaceC5965pc0("remember") int i, @InterfaceC5965pc0("token") @NotNull String str4, @InterfaceC5965pc0("g-recaptcha-response") @NotNull String str5, @InterfaceC5965pc0("code") @NotNull String str6, @InterfaceC5965pc0("submitLogin") int i2, @InterfaceC4686jX1 @NotNull C7698xq0 c7698xq0, @NotNull JM<? super C0935Et1<AuthorizationResponseImpl>> jm);

    @InterfaceC4734jk0
    @Nullable
    Object h(@Ka2 @NotNull String str, @InterfaceC1854Qn0("Cookie") @NotNull String str2, @InterfaceC1854Qn0("Width") @NotNull String str3, @NotNull JM<? super AbstractC1091Gt1> jm);

    @InterfaceC0976Fh0
    @InterfaceC2206Va1("{fullPath}")
    @Nullable
    Object i(@InterfaceC0884Ec1(encoded = true, value = "fullPath") @NotNull String str, @InterfaceC8102zl1(encoded = true, value = "utm_campaign") @Nullable String str2, @InterfaceC8102zl1(encoded = true, value = "utm_source") @Nullable String str3, @InterfaceC8102zl1(encoded = true, value = "utm_medium") @Nullable String str4, @InterfaceC8102zl1(encoded = true, value = R51.PUSH_ADDITIONAL_DATA_KEY) @Nullable String str5, @InterfaceC8102zl1(encoded = true, value = "ac") @Nullable String str6, @InterfaceC8102zl1(encoded = true, value = "code") @Nullable String str7, @InterfaceC5965pc0("email") @NotNull String str8, @InterfaceC5965pc0("password") @NotNull String str9, @InterfaceC5965pc0("submitLogin") int i, @InterfaceC4686jX1 @NotNull C7698xq0 c7698xq0, @NotNull JM<? super C0935Et1<AuthorizationResponseImpl>> jm);

    @InterfaceC4734jk0("{fullPath}")
    @Nullable
    Object j(@InterfaceC0884Ec1(encoded = true, value = "fullPath") @NotNull String str, @InterfaceC8102zl1("token") @NotNull String str2, @InterfaceC4686jX1 @NotNull C7698xq0 c7698xq0, @NotNull JM<? super C0935Et1<AbstractC1091Gt1>> jm);
}
