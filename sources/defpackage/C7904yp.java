package defpackage;

import com.base.feature.onboarding.screens.tutorial.TutorialFragment;
import com.google.gson.Gson;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7904yp implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ C7904yp(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                O1 interceptor = (O1) ((C0765Cp) this.b).get();
                Intrinsics.checkNotNullParameter(interceptor, "interceptor");
                Intrinsics.checkNotNullParameter("https://api.pbotservices.com/", "endPointHttps");
                Intrinsics.checkNotNullParameter(interceptor, "interceptor");
                C2263Vt1.b bVar = new C2263Vt1.b();
                bVar.b("https://api.pbotservices.com/");
                bVar.b = SO1.a(interceptor, null);
                C4746jn0 c4746jn0 = new C4746jn0(new Gson());
                Intrinsics.checkNotNullExpressionValue(c4746jn0, "create(...)");
                bVar.a(new OX1(c4746jn0));
                C2263Vt1 c2263Vt1C = bVar.c();
                Intrinsics.checkNotNullExpressionValue(c2263Vt1C, "build(...)");
                Object objB = c2263Vt1C.b(InterfaceC7007ua1.class);
                Intrinsics.checkNotNullExpressionValue(objB, "create(...)");
                InterfaceC7007ua1 interfaceC7007ua1 = (InterfaceC7007ua1) objB;
                C0957Fb.i(interfaceC7007ua1);
                return interfaceC7007ua1;
            case 1:
                InterfaceC1612Nk1<C6651sr1> interfaceC1612Nk1 = ((C5130le0) this.b).c;
                C0957Fb.h(interfaceC1612Nk1, "Cannot return null from a non-@Nullable @Provides method");
                return interfaceC1612Nk1;
            case 2:
                ((C7784yF0) this.b).getClass();
                return new C8091zi2(4, R.layout.dg_item_welcome_message);
            default:
                return new TutorialFragment((Sd2) ((OW) this.b).get());
        }
    }

    public C7904yp(U0 u0, C0765Cp c0765Cp) {
        this.a = 0;
        this.b = c0765Cp;
    }
}
