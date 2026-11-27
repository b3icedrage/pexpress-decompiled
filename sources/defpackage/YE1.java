package defpackage;

import com.base.feature.alertdialog.screen.StarViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class YE1 implements Function1 {
    public final /* synthetic */ int d;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                C6942uF it = (C6942uF) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.c;
            case 1:
                return Boolean.valueOf(obj == null);
            case 2:
                ((Boolean) obj).booleanValue();
                int i = StarViewGroup.i;
                return Unit.a;
            default:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    th.getMessage();
                }
                return Unit.a;
        }
    }
}
