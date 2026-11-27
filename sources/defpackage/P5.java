package defpackage;

import com.base.feature.activation.screens.big_stories.ActivationBigStoriesFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class P5 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ P5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new ActivationBigStoriesFragment((Sd2) ((OW) this.b).get());
            case 1:
                C7784yF0 c7784yF0 = (C7784yF0) this.b;
                C7130v80 viewModelProvider = C7130v80.a.a;
                Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
                FP0 viewLifecycleOwner = c7784yF0.a.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
                return new C6500s80(viewLifecycleOwner);
            default:
                return new HA1((C1183Hy0) ((C1261Iy0) this.b).get());
        }
    }
}
