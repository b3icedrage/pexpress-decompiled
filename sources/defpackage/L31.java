package defpackage;

import com.google.gson.Gson;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class L31 {
    @NotNull
    public static C3109cD1 a(@NotNull InterfaceC0776Cs1 requestFactory, @NotNull IP0 lifecycle, @NotNull C7250vi2 interceptor, @NotNull C6818tf2 messageAdapterFactoryProvider) {
        Intrinsics.checkNotNullParameter(requestFactory, "requestFactory");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycleRegistry");
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        Intrinsics.checkNotNullParameter(messageAdapterFactoryProvider, "messageAdapterFactoryProvider");
        C4487in0 c4487in0 = new C4487in0();
        c4487in0.g = true;
        Gson gsonA = c4487in0.a();
        C3109cD1.a aVar = new C3109cD1.a();
        C6711t81 newWebSocketFactory = SO1.a(interceptor, 20L);
        Intrinsics.checkNotNullParameter(newWebSocketFactory, "$this$newWebSocketFactory");
        Intrinsics.checkNotNullParameter(requestFactory, "requestFactory");
        F81.a factory = new F81.a(new C6921u81(newWebSocketFactory, requestFactory));
        Intrinsics.checkNotNullParameter(factory, "factory");
        aVar.a = factory;
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        aVar.b = lifecycle;
        Intrinsics.checkNotNull(gsonA);
        MX1 factory2 = new MX1((InterfaceC6793tZ0.a) messageAdapterFactoryProvider.invoke(gsonA));
        Intrinsics.checkNotNullParameter(factory2, "factory");
        ArrayList arrayList = aVar.d;
        arrayList.add(factory2);
        TN factory3 = new TN();
        Intrinsics.checkNotNullParameter(factory3, "factory");
        ArrayList arrayList2 = aVar.e;
        arrayList2.add(factory3);
        InterfaceC7394wP0 interfaceC7394wP0 = aVar.b;
        F81.a aVar2 = aVar.a;
        if (aVar2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        C0957Fb c0957Fb = aVar.c;
        AbstractC4836kD1 abstractC4836kD1 = C3109cD1.a.i;
        C2695aK.a aVar3 = new C2695aK.a(interfaceC7394wP0, aVar2, c0957Fb, abstractC4836kD1);
        arrayList.add(new C6451rv());
        Unit unit = Unit.a;
        C7003uZ0 c7003uZ0 = new C7003uZ0(CollectionsKt.e0(arrayList));
        arrayList2.add(new C6871tv());
        WK0 wk0 = new WK0(CollectionsKt.e0(arrayList2));
        D80.b bVar = new D80.b(c7003uZ0);
        AbstractC5694oI1.c.a aVar4 = new AbstractC5694oI1.c.a(c7003uZ0);
        AbstractC5694oI1.b.a aVar5 = new AbstractC5694oI1.b.a(abstractC4836kD1, bVar, wk0);
        AB1 ab1 = aVar.f;
        return new C3109cD1(ab1, new C5061lI1.a(aVar3, new C6533sI1.a(ab1, aVar4, aVar5)));
    }
}
