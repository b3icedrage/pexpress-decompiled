package defpackage;

import com.jivosite.sdk.model.pojo.socket.SocketMessage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Bk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0672Bk implements JN1 {

    @NotNull
    public final InterfaceC5570ni1 a;

    @NotNull
    public final M3 b;

    @NotNull
    public final InterfaceC5889pD1 c;

    @NotNull
    public final InterfaceC7170vL d;

    public C0672Bk(@NotNull InterfaceC5570ni1 profileRepository, @NotNull M3 updatePushTokenUseCaseProvider, @NotNull InterfaceC5889pD1 schedulers, @NotNull InterfaceC7170vL contactFormRepository) {
        Intrinsics.checkNotNullParameter(profileRepository, "profileRepository");
        Intrinsics.checkNotNullParameter(updatePushTokenUseCaseProvider, "updatePushTokenUseCaseProvider");
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        Intrinsics.checkNotNullParameter(contactFormRepository, "contactFormRepository");
        this.a = profileRepository;
        this.b = updatePushTokenUseCaseProvider;
        this.c = schedulers;
        this.d = contactFormRepository;
    }

    @Override // defpackage.JN1
    public final void a(@NotNull SocketMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String str = message.b;
        if (str != null) {
            this.a.setId(str);
            this.c.b().execute(new RunnableC1290Ji(this, 1));
        }
    }
}
