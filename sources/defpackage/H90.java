package defpackage;

import com.jivosite.sdk.model.pojo.history.HistoryMessage;
import com.jivosite.sdk.model.pojo.message.ClientMessage;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class H90 extends ML0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H90(Object obj, int i) {
        super(1);
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object objA;
        Object obj2 = null;
        Object obj3 = this.e;
        switch (this.d) {
            case 0:
                Throwable e = (Throwable) obj;
                Intrinsics.checkNotNullParameter(e, "e");
                try {
                    C1717Ot1.a aVar = C1717Ot1.e;
                    Object objNewInstance = ((Constructor) obj3).newInstance(new Object[0]);
                    Intrinsics.c(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                    Throwable th = (Throwable) objNewInstance;
                    th.initCause(e);
                    objA = th;
                    break;
                } catch (Throwable th2) {
                    C1717Ot1.a aVar2 = C1717Ot1.e;
                    objA = C1795Pt1.a(th2);
                }
                return (Throwable) (objA instanceof C1717Ot1.b ? null : objA);
            case 1:
                List messages = (List) obj;
                Intrinsics.checkNotNullParameter(messages, "messages");
                HistoryMessage historyMessage = (HistoryMessage) CollectionsKt.N(messages);
                if (historyMessage != null) {
                    C2511Yo0 c2511Yo0 = (C2511Yo0) obj3;
                    if (c2511Yo0.e.getState().c < historyMessage.c) {
                        c2511Yo0.e.h();
                    }
                }
                return Unit.a;
            default:
                HF1 state = (HF1) obj;
                Intrinsics.checkNotNullParameter(state, "state");
                for (Object obj4 : state.a) {
                    if (Intrinsics.a(((ClientMessage) obj4).a, (String) obj3)) {
                        obj2 = obj4;
                        return Boolean.valueOf(obj2 != null);
                    }
                }
                return Boolean.valueOf(obj2 != null);
        }
    }
}
