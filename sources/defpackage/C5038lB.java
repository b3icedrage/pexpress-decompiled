package defpackage;

import android.app.Activity;
import com.base.feature.robot.robot.double_strategies.screens.RobotDoubleStrategiesPart;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: lB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5038lB implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final InterfaceC1454Lk1 c;

    public /* synthetic */ C5038lB(Object obj, InterfaceC1454Lk1 interfaceC1454Lk1, int i) {
        this.a = i;
        this.b = obj;
        this.c = interfaceC1454Lk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C4618jB((InterfaceC5889pD1) this.c.get(), (EK1) ((InterfaceC1454Lk1) this.b).get());
            case 1:
                C7784yF0 c7784yF0 = (C7784yF0) this.b;
                C0687Bp viewModelProvider = (C0687Bp) this.c;
                Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
                FP0 viewLifecycleOwner = c7784yF0.a.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "fragment.viewLifecycleOwner");
                return new GD(viewLifecycleOwner, viewModelProvider);
            case 2:
                return new C2879b71((Activity) ((InterfaceC1531Mk1) this.b).get(), (AbstractC1841Qj) ((C1997Sj) this.c).get());
            default:
                return new RobotDoubleStrategiesPart((InterfaceC8143zy1) ((InterfaceC1531Mk1) this.b).get(), (Sd2) ((OW) this.c).get(), new C3481e1());
        }
    }
}
