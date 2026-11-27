package defpackage;

import com.jivosite.sdk.model.pojo.socket.SocketMessage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Ik, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1218Ik implements JN1 {

    @NotNull
    public final InterfaceC0836Dm1 a;

    public C1218Ik(@NotNull InterfaceC0836Dm1 ratingRepository) {
        Intrinsics.checkNotNullParameter(ratingRepository, "ratingRepository");
        this.a = ratingRepository;
    }

    @Override // defpackage.JN1
    public final void a(@NotNull SocketMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String str = message.c;
        if (str == null) {
            return;
        }
        this.a.y(str);
    }
}
