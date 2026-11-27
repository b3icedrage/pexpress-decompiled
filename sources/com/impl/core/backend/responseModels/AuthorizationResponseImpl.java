package com.impl.core.backend.responseModels;

import com.api.core.backend.domain.models.requestModels.DuoAuthType;
import com.api.core.backend.repositories.user.models.responses.CommonLoginResponse;
import com.impl.core.backend.abstractModels.http.HttpPlatformResponse;
import defpackage.C5807oq;
import defpackage.C6315rG;
import defpackage.InterfaceC1247It1;
import defpackage.InterfaceC2691aI1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u0000 \u00142\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/impl/core/backend/responseModels/AuthorizationResponseImpl;", "Lcom/impl/core/backend/abstractModels/http/HttpPlatformResponse;", "LIt1;", "LrG;", "", "renderCaptcha", "Ljava/lang/Boolean;", "getRenderCaptcha", "()Ljava/lang/Boolean;", "", "rUrl", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "fHTML", "getFHTML", "token", "getToken", "e", "(Ljava/lang/String;)V", "Companion", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AuthorizationResponseImpl extends HttpPlatformResponse implements InterfaceC1247It1<C6315rG> {

    @NotNull
    private static final Companion Companion = new Companion();

    @Deprecated
    @NotNull
    public static final String FORM_INPUT = "<input";

    @Deprecated
    @NotNull
    public static final String GOOGLE_AUTH_PLACEHOLDER_VALUE = "Google auth code";

    @Deprecated
    @NotNull
    public static final String UNSUPPORTED_2FA_METHOD = "unsupported 2FA form";

    @InterfaceC2691aI1("field_html")
    @Nullable
    private final String fHTML;

    @InterfaceC2691aI1("redirectUrl")
    @Nullable
    private final String rUrl;

    @InterfaceC2691aI1("render_captcha")
    @Nullable
    private final Boolean renderCaptcha;

    @Nullable
    private String token;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/impl/core/backend/responseModels/AuthorizationResponseImpl$Companion;", "", "<init>", "()V", "GOOGLE_AUTH_PLACEHOLDER_VALUE", "", "FORM_INPUT", "UNSUPPORTED_2FA_METHOD", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRUrl() {
        return this.rUrl;
    }

    public final void e(@Nullable String str) {
        this.token = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthorizationResponseImpl)) {
            return false;
        }
        AuthorizationResponseImpl authorizationResponseImpl = (AuthorizationResponseImpl) obj;
        return Intrinsics.a(this.renderCaptcha, authorizationResponseImpl.renderCaptcha) && Intrinsics.a(this.rUrl, authorizationResponseImpl.rUrl) && Intrinsics.a(this.fHTML, authorizationResponseImpl.fHTML);
    }

    @Override // defpackage.InterfaceC1247It1
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final C6315rG a() {
        String str = this.token;
        if (str == null) {
            String str2 = this.rUrl;
            String str3 = null;
            if (str2 != null) {
                String strX = StringsKt.X(StringsKt.V(str2, "token=", ""), '&');
                if (strX.length() != 0) {
                    str3 = strX;
                }
            }
            str = str3;
            if (str == null) {
                str = "";
            }
        }
        return new C6315rG(str);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    @NotNull
    public final CommonLoginResponse g() {
        String strX = this.token;
        String value = null;
        if (strX == null) {
            String str = this.rUrl;
            if (str != null) {
                strX = StringsKt.X(StringsKt.V(str, "token=", ""), '&');
                if (strX.length() == 0) {
                    strX = null;
                }
            } else {
                strX = null;
            }
        }
        String str2 = this.fHTML;
        if (str2 != null) {
            if (StringsKt.C(str2, GOOGLE_AUTH_PLACEHOLDER_VALUE, false)) {
                value = DuoAuthType.GOOGLE_AUTH.getValue();
            } else if (StringsKt.C(this.fHTML, FORM_INPUT, true)) {
                value = UNSUPPORTED_2FA_METHOD;
            }
        }
        return new CommonLoginResponse(strX, value);
    }

    public final int hashCode() {
        Boolean bool = this.renderCaptcha;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.rUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fHTML;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        Boolean bool = this.renderCaptcha;
        String str = this.rUrl;
        String str2 = this.fHTML;
        StringBuilder sb = new StringBuilder("AuthorizationResponseImpl(renderCaptcha=");
        sb.append(bool);
        sb.append(", rUrl=");
        sb.append(str);
        sb.append(", fHTML=");
        return C5807oq.b(sb, str2, ")");
    }
}
