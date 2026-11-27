package defpackage;

import com.jivosite.sdk.model.pojo.socket.SocketMessage;
import com.jivosite.sdk.socket.JivoWebSocketService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: qW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6154qW implements R42 {

    @NotNull
    public final ArrayList a = new ArrayList();

    @NotNull
    public final LinkedList<Object> b = new LinkedList<>();

    @Override // defpackage.R42
    public final void a(@NotNull SocketMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            this.b.add(message);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((S42) it.next()).a(message);
        }
    }

    @Override // defpackage.R42
    public final void b(@NotNull JivoWebSocketService subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        this.a.remove(subscriber);
    }

    @Override // defpackage.R42
    public final void c(@NotNull S42 subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        this.a.add(subscriber);
        LinkedList<Object> linkedList = this.b;
        if (linkedList.isEmpty()) {
            return;
        }
        for (Object obj : linkedList) {
            if (obj instanceof String) {
                subscriber.b((String) obj);
            } else if (obj instanceof SocketMessage) {
                subscriber.a((SocketMessage) obj);
            }
        }
        linkedList.clear();
    }
}
