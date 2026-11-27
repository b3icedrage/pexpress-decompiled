package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xe2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7655xe2 extends ML0 implements Function1<DS0, List<InterfaceC7445we2>> {
    public static final C7655xe2 d = new C7655xe2(1);

    @Override // kotlin.jvm.functions.Function1
    public final List<InterfaceC7445we2> invoke(DS0 ds0) {
        DS0 logger = ds0;
        Intrinsics.checkNotNullParameter(logger, "logger");
        ArrayList arrayList = new ArrayList();
        if (ED.k("androidx.compose.ui.node.Owner", null) && ED.k("com.amplitude.android.internal.locators.ComposeViewTargetLocator", null)) {
            arrayList.add(new C7579xH(logger));
        }
        arrayList.add(new C1661Ob());
        return arrayList;
    }
}
