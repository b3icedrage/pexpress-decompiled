package defpackage;

import com.jivosite.sdk.model.pojo.socket.SocketMessage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Lk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1452Lk implements JN1 {

    @NotNull
    public final M8 a;

    public C1452Lk(@NotNull M8 agentRepository) {
        Intrinsics.checkNotNullParameter(agentRepository, "agentRepository");
        this.a = agentRepository;
    }

    @Override // defpackage.JN1
    public final void a(@NotNull SocketMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String str = message.c;
        if (str != null) {
            String str2 = message.b;
            if (str2 == null) {
                str2 = "";
            }
            this.a.u(str, str2);
        }
    }
}
