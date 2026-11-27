package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3254cv1 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ C3668eu e;

    public /* synthetic */ C3254cv1(C3668eu c3668eu, int i) {
        this.d = i;
        this.e = c3668eu;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                InterfaceC3453ds0 newBottomSheetDialog = (InterfaceC3453ds0) obj;
                Intrinsics.checkNotNullParameter(newBottomSheetDialog, "$this$newBottomSheetDialog");
                newBottomSheetDialog.b(this.e);
                break;
            default:
                InterfaceC3453ds0 newBottomSheetDialog2 = (InterfaceC3453ds0) obj;
                Intrinsics.checkNotNullParameter(newBottomSheetDialog2, "$this$newBottomSheetDialog");
                newBottomSheetDialog2.b(this.e);
                break;
        }
        return Unit.a;
    }
}
