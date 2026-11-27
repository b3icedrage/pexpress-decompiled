package defpackage;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ne0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5553ne0 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ C5553ne0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                InterfaceC2400Xd0 interfaceC2400Xd0 = ((C5130le0) this.b).b;
                C0957Fb.h(interfaceC2400Xd0, "Cannot return null from a non-@Nullable @Provides method");
                return interfaceC2400Xd0;
            case 1:
                return new C1648Nw1((Context) ((C6) this.b).get(), new Nm2());
            default:
                Map fragmentsMap = (Map) ((OW) this.b).get();
                Intrinsics.checkNotNullParameter(fragmentsMap, "fragmentsMap");
                return new C3741fE1(fragmentsMap);
        }
    }
}
