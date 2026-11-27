package defpackage;

import com.base.feature.stories.screens.full.FullStoriesFragmentBase;
import com.google.gson.Gson;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8114zp implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC5331mb0 b;

    public /* synthetic */ C8114zp(InterfaceC5331mb0 interfaceC5331mb0, int i) {
        this.a = i;
        this.b = interfaceC5331mb0;
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
                Object objB = c2263Vt1C.b(InterfaceC7864ye1.class);
                Intrinsics.checkNotNullExpressionValue(objB, "create(...)");
                InterfaceC7864ye1 interfaceC7864ye1 = (InterfaceC7864ye1) objB;
                C0957Fb.i(interfaceC7864ye1);
                return interfaceC7864ye1;
            case 1:
                return new FullStoriesFragmentBase((Sd2) ((OW) this.b).get());
            default:
                return new C3996gT1(new SS1(), (InterfaceC5937pT1) ((C1299Jl) this.b).get());
        }
    }

    public C8114zp(C0957Fb c0957Fb, C0765Cp c0765Cp) {
        this.a = 0;
        this.b = c0765Cp;
    }
}
