package defpackage;

import com.jivosite.sdk.ui.chat.JivoChatFragment;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class W6 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1454Lk1 d;

    public /* synthetic */ W6(Object obj, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1454Lk1 interfaceC1454Lk1, int i) {
        this.a = i;
        this.b = obj;
        this.c = interfaceC1531Mk1;
        this.d = interfaceC1454Lk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                C4923kf appData = (C4923kf) ((InterfaceC1531Mk1) this.b).get();
                Set updaters = (Set) ((C4176hJ1) this.d).get();
                InterfaceC1777Pn1 readyToStartUpdatersProvider = (InterfaceC1777Pn1) this.c.get();
                Intrinsics.checkNotNullParameter(appData, "appData");
                Intrinsics.checkNotNullParameter(updaters, "updaters");
                Intrinsics.checkNotNullParameter(readyToStartUpdatersProvider, "readyToStartUpdatersProvider");
                GP1 starterObservable = appData.f;
                Intrinsics.checkNotNullParameter(starterObservable, "starterObservable");
                Intrinsics.checkNotNullParameter(updaters, "updaters");
                Intrinsics.checkNotNullParameter(readyToStartUpdatersProvider, "readyToStartUpdatersProvider");
                return new V6(starterObservable, updaters, readyToStartUpdatersProvider, false);
            case 1:
                return new C3099cA0((US1) ((InterfaceC1531Mk1) this.b).get(), (C7641xb0) this.c.get(), (InterfaceC2124Tz0) ((C2666aA0) this.d).get());
            default:
                C7784yF0 c7784yF0 = (C7784yF0) this.b;
                C5664o9 viewModelProvider = (C5664o9) this.c;
                Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
                InterfaceC1454Lk1 markwonProvider = this.d;
                Intrinsics.checkNotNullParameter(markwonProvider, "markwonProvider");
                JivoChatFragment jivoChatFragment = c7784yF0.a;
                FP0 viewLifecycleOwner = jivoChatFragment.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
                return new C4143h9(viewLifecycleOwner, viewModelProvider, jivoChatFragment.i(), markwonProvider);
        }
    }

    public W6(InterfaceC1531Mk1 interfaceC1531Mk1, C4176hJ1 c4176hJ1, InterfaceC1531Mk1 interfaceC1531Mk2) {
        this.a = 0;
        this.b = interfaceC1531Mk1;
        this.d = c4176hJ1;
        this.c = interfaceC1531Mk2;
    }
}
