package defpackage;

import com.jivosite.sdk.model.pojo.socket.SocketMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class L92 extends ML0 implements Function1<N92, N92> {
    public final /* synthetic */ M92 d;
    public final /* synthetic */ SocketMessage e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L92(M92 m92, SocketMessage socketMessage) {
        super(1);
        this.d = m92;
        this.e = socketMessage;
    }

    @Override // kotlin.jvm.functions.Function1
    public final N92 invoke(N92 n92) {
        N92 state = n92;
        Intrinsics.checkNotNullParameter(state, "state");
        M92 m92 = this.d;
        TreeMap treeMap = m92.f;
        SocketMessage socketMessage = this.e;
        treeMap.put(C3481e1.e(socketMessage.c).e, socketMessage);
        Set setEntrySet = m92.f.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "messagesCache.entries");
        ArrayList messages = new ArrayList(XE.m(setEntrySet, 10));
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            messages.add((SocketMessage) ((Map.Entry) it.next()).getValue());
        }
        state.getClass();
        Intrinsics.checkNotNullParameter(messages, "messages");
        return new N92(messages);
    }
}
