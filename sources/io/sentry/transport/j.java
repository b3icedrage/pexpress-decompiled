package io.sentry.transport;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends Authenticator {

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    public j(@NotNull String str, @NotNull String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // java.net.Authenticator
    @Nullable
    public final PasswordAuthentication getPasswordAuthentication() {
        if (getRequestorType() != Authenticator.RequestorType.PROXY) {
            return null;
        }
        return new PasswordAuthentication(this.a, this.b.toCharArray());
    }
}
