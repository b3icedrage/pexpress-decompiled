package com.api.core.backend.repositories.user.models.requests;

import defpackage.InterfaceC2691aI1;
import defpackage.R51;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0016\u0018\u0000 *2\u00020\u0001:\u0001*R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0004\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR$\u0010!\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR$\u0010$\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0004\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR$\u0010'\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0004\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\b¨\u0006+"}, d2 = {"Lcom/api/core/backend/repositories/user/models/requests/RegisterRequest;", "", "", "email", "Ljava/lang/String;", R51.PUSH_ADDITIONAL_DATA_KEY, "()Ljava/lang/String;", "h", "(Ljava/lang/String;)V", "password", "b", "j", "language", "getLanguage", "i", "clientType", "getClientType", "f", "subId", "getSubId", "k", "", "isMobile", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "setMobile", "(Ljava/lang/Integer;)V", "currencyCode", "getCurrencyCode", "g", "affId", "getAffId", "c", "subId1", "getSubId1", "l", "captcha", "getCaptcha", "e", "afftrack", "getAfftrack", "d", "Companion", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RegisterRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @Nullable
    private String affId;

    @Nullable
    private String afftrack;

    @Nullable
    private String captcha;

    @Nullable
    private String clientType;

    @Nullable
    private String currencyCode;

    @Nullable
    private String email;

    @InterfaceC2691aI1("is_mobile")
    @Nullable
    private Integer isMobile;

    @Nullable
    private String language;

    @Nullable
    private String password;

    @Nullable
    private String subId;

    @Nullable
    private String subId1;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/repositories/user/models/requests/RegisterRequest$Companion;", "", "<init>", "()V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public RegisterRequest() {
        this(0);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    public final void c(@Nullable String str) {
        this.affId = str;
    }

    public final void d(@Nullable String str) {
        this.afftrack = str;
    }

    public final void e(@Nullable String str) {
        this.captcha = str;
    }

    public final void f() {
        this.clientType = "web";
    }

    public final void g() {
        this.currencyCode = null;
    }

    public final void h(@Nullable String str) {
        this.email = str;
    }

    public final void i(@Nullable String str) {
        this.language = str;
    }

    public final void j(@Nullable String str) {
        this.password = str;
    }

    public final void k(@Nullable String str) {
        this.subId = str;
    }

    public final void l() {
        this.subId1 = null;
    }

    public RegisterRequest(int i) {
        this.email = "";
        this.password = "";
        this.language = "";
        this.clientType = "";
        this.subId = "";
        this.isMobile = 1;
        this.currencyCode = "";
        this.affId = "";
        this.subId1 = "";
        this.captcha = "";
        this.afftrack = "";
    }
}
