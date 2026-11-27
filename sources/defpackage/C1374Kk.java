package defpackage;

import com.jivosite.sdk.model.pojo.socket.SocketMessage;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Kk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1374Kk implements JN1 {

    @NotNull
    public final M8 a;

    public C1374Kk(@NotNull M8 agentRepository) {
        Intrinsics.checkNotNullParameter(agentRepository, "agentRepository");
        this.a = agentRepository;
    }

    @Override // defpackage.JN1
    public final void a(@NotNull SocketMessage message) {
        Unit unit;
        Intrinsics.checkNotNullParameter(message, "message");
        String str = message.c;
        M8 m8 = this.a;
        if (str != null) {
            String str2 = message.b;
            if (str2 == null) {
                str2 = "";
            }
            m8.q(str, str2);
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit == null) {
            m8.J();
        }
    }
}
