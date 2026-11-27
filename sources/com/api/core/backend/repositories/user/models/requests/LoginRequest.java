package com.api.core.backend.repositories.user.models.requests;

import defpackage.InterfaceC2691aI1;
import defpackage.R51;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/api/core/backend/repositories/user/models/requests/LoginRequest;", "", "", "login", "Ljava/lang/String;", R51.PUSH_ADDITIONAL_DATA_KEY, "()Ljava/lang/String;", "c", "(Ljava/lang/String;)V", "password", "b", "d", "token", "getToken", "e", "Companion", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LoginRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @InterfaceC2691aI1("identifier")
    @Nullable
    private String login;

    @InterfaceC2691aI1("password")
    @Nullable
    private String password;

    @Nullable
    private String token;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/repositories/user/models/requests/LoginRequest$Companion;", "", "<init>", "()V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public LoginRequest() {
        this(0);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getLogin() {
        return this.login;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    public final void c(@Nullable String str) {
        this.login = str;
    }

    public final void d(@Nullable String str) {
        this.password = str;
    }

    public final void e(@Nullable String str) {
        this.token = str;
    }

    public LoginRequest(int i) {
        this.login = "";
        this.password = "";
        this.token = null;
    }
}
