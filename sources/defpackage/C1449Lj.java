package defpackage;

import android.content.Context;
import android.os.Looper;
import android.webkit.WebView;
import com.base.feature.platform.screens.platform_webview.PlatformFragmentBase;
import com.base.feature.registration.screens.selecthaveaccount.SelectHaveAccountFragmentBase;
import com.base.feature.robot.robot.confirm_bottomsheet.screens.stop_cofirm.StopConfirmBottomSheetDialogFragment;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Lj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1449Lj implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C1449Lj(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean zContainsKey;
        int i = 1;
        switch (this.d) {
            case 0:
                return C6621sj.l((Object[]) this.e);
            case 1:
                PlatformFragmentBase platformFragmentBase = (PlatformFragmentBase) this.e;
                Object obj = platformFragmentBase.i;
                Intrinsics.checkNotNull(obj);
                AbstractC2140Ue1 abstractC2140Ue1 = (AbstractC2140Ue1) obj;
                Context context = platformFragmentBase.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                abstractC2140Ue1.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                C5189lv.k(C8056za.j(abstractC2140Ue1), null, new C2062Te1(abstractC2140Ue1, null), 3);
                return Unit.a;
            case 2:
                ((C2360Wy1) this.e).l(L80.MAX_PROFIT);
                return Unit.a;
            case 3:
                return ((SelectHaveAccountFragmentBase) this.e).j;
            case 4:
                return ((StopConfirmBottomSheetDialogFragment) this.e).i;
            case 5:
                C7238vf2 c7238vf2 = (C7238vf2) this.e;
                C3109cD1 c3109cD1 = c7238vf2.c;
                if (c3109cD1 == null) {
                    if (Intrinsics.a(Looper.myLooper(), Looper.getMainLooper())) {
                        throw new IllegalStateException("Scarlet client read on the main thread before initializeClient()");
                    }
                    c3109cD1 = (C3109cD1) C5189lv.o(new C6608sf2(c7238vf2, null));
                    if (c3109cD1 == null) {
                        throw new IllegalStateException("Scarlet client was not initialized within 10000ms");
                    }
                }
                Intrinsics.checkNotNullParameter(InterfaceC5125ld.class, "service");
                C5061lI1.a aVar = c3109cD1.b;
                Intrinsics.checkNotNullParameter(InterfaceC5125ld.class, "serviceInterface");
                if (!InterfaceC5125ld.class.isInterface()) {
                    throw new IllegalArgumentException("Service declarations must be interfaces.");
                }
                Class<?>[] interfaces = InterfaceC5125ld.class.getInterfaces();
                Intrinsics.checkNotNullExpressionValue(interfaces, "service.interfaces");
                if (interfaces.length != 0) {
                    throw new IllegalArgumentException("Service interfaces must not extend other interfaces.");
                }
                C2695aK.a aVar2 = aVar.a;
                C2695aK connection = new C2695aK(new C2695aK.b((InterfaceC7394wP0) aVar2.a.getValue(), aVar2.c, aVar2.d, aVar2.e));
                C6533sI1.a aVar3 = aVar.b;
                Intrinsics.checkNotNullParameter(InterfaceC5125ld.class, "serviceInterface");
                Intrinsics.checkNotNullParameter(connection, "connection");
                Method[] declaredMethods = InterfaceC5125ld.class.getDeclaredMethods();
                Intrinsics.checkNotNullExpressionValue(declaredMethods, "declaredMethods");
                ArrayList<Method> arrayList = new ArrayList();
                for (Method it : declaredMethods) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    if (!aVar3.a.b(it)) {
                        arrayList.add(it);
                    }
                }
                ArrayList arrayList2 = new ArrayList(XE.m(arrayList, 10));
                for (Method it2 : arrayList) {
                    Intrinsics.checkNotNullExpressionValue(it2, "it");
                    Annotation[] annotations = it2.getAnnotations();
                    Intrinsics.checkNotNullExpressionValue(annotations, "annotations");
                    ArrayList arrayList3 = new ArrayList();
                    int length = annotations.length;
                    int i2 = 0;
                    while (i2 < length) {
                        Annotation it3 = annotations[i2];
                        Intrinsics.checkNotNullExpressionValue(it3, "it");
                        int i3 = i;
                        AbstractC5694oI1.a aVar4 = it3 instanceof InterfaceC6734tF1 ? aVar3.b : it3 instanceof InterfaceC0608Ao1 ? aVar3.c : null;
                        if (aVar4 != null) {
                            arrayList3.add(aVar4);
                        }
                        i2++;
                        i = i3;
                    }
                    if (arrayList3.size() != i) {
                        throw new IllegalArgumentException(("A method must have one and only one service method annotation: " + it2).toString());
                    }
                    arrayList2.add(((AbstractC5694oI1.a) CollectionsKt.F(arrayList3)).a(connection, it2));
                }
                C5061lI1 c5061lI1 = new C5061lI1(connection, new C6533sI1(PW0.j(CollectionsKt.j0(arrayList, arrayList2))));
                C2695aK.b bVar = connection.a;
                bVar.d.b(bVar.a);
                return (InterfaceC5125ld) InterfaceC5125ld.class.cast(Proxy.newProxyInstance(InterfaceC5125ld.class.getClassLoader(), new Class[]{InterfaceC5125ld.class}, new C3319dD1(c3109cD1, c5061lI1)));
            case 6:
                InterfaceC4930kg2 interfaceC4930kg2 = (InterfaceC4930kg2) this.e;
                Intrinsics.c(interfaceC4930kg2, "null cannot be cast to non-null type com.impl.core.backend.repositories.WebSocketConnectionRepositoryImpl");
                return (C5563ng2) interfaceC4930kg2;
            default:
                C2778ai2 c2778ai2 = (C2778ai2) this.e;
                WebView webView = c2778ai2.c.invoke();
                if (webView != null) {
                    WeakHashMap<WebView, String> weakHashMap = ZD1.a;
                    Intrinsics.checkNotNullParameter(webView, "webView");
                    WeakHashMap<WebView, String> weakHashMap2 = ZD1.a;
                    synchronized (weakHashMap2) {
                        zContainsKey = weakHashMap2.containsKey(webView);
                    }
                    if (zContainsKey || !webView.canGoBack()) {
                        c2778ai2.b.invoke();
                    } else {
                        webView.goBack();
                    }
                } else {
                    c2778ai2.b.invoke();
                }
                return Unit.a;
        }
    }
}
