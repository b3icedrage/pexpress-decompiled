package defpackage;

import com.jivosite.sdk.model.pojo.message.ClientMessage;
import java.lang.reflect.Constructor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class E90 extends ML0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E90(Object obj, int i) {
        super(1);
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r2v4, types: [ML0, kotlin.jvm.functions.Function1] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it) {
        Object objA;
        boolean z;
        Object obj = null;
        char c = 1;
        char c2 = 1;
        Object obj2 = this.e;
        switch (this.d) {
            case 0:
                Throwable e = (Throwable) it;
                Intrinsics.checkNotNullParameter(e, "e");
                try {
                    C1717Ot1.a aVar = C1717Ot1.e;
                    Object objNewInstance = ((Constructor) obj2).newInstance(e.getMessage(), e);
                    Intrinsics.c(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                    objA = (Throwable) objNewInstance;
                    break;
                } catch (Throwable th) {
                    C1717Ot1.a aVar2 = C1717Ot1.e;
                    objA = C1795Pt1.a(th);
                }
                return (Throwable) (objA instanceof C1717Ot1.b ? null : objA);
            case 1:
                C5818ot1 loadSilentlyResource = (C5818ot1) it;
                Intrinsics.checkNotNullParameter(loadSilentlyResource, "$this$loadSilentlyResource");
                C5892pE1 c5892pE1 = (C5892pE1) obj2;
                XK0 consumer = new XK0(c5892pE1, c2 == true ? 1 : 0);
                loadSilentlyResource.getClass();
                Intrinsics.checkNotNullParameter(consumer, "consumer");
                loadSilentlyResource.e = consumer;
                R71 consumer2 = new R71(c5892pE1, c == true ? 1 : 0);
                Intrinsics.checkNotNullParameter(consumer2, "consumer");
                loadSilentlyResource.d = consumer2;
                return Unit.a;
            case 2:
                HF1 state = (HF1) it;
                Intrinsics.checkNotNullParameter(state, "state");
                String str = (String) obj2;
                if (str != null) {
                    for (Object obj3 : state.a) {
                        if (Intrinsics.a(((ClientMessage) obj3).a, str)) {
                            obj = obj3;
                            z = obj != null;
                        }
                    }
                    if (obj != null) {
                    }
                }
                return Boolean.valueOf(z);
            default:
                Intrinsics.d(it, "it");
                Boolean bool = (Boolean) ((ML0) obj2).invoke(it);
                bool.getClass();
                return bool;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public E90(Function1 function1) {
        super(1);
        this.d = 3;
        this.e = (ML0) function1;
    }
}
