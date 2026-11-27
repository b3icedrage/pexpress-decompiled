package defpackage;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: p7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5866p7 extends AbstractC5023l7<Intent, C4603j7> {
    @Override // defpackage.AbstractC5023l7
    public final Intent a(Context context, Intent intent) {
        Intent input = intent;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return input;
    }

    @Override // defpackage.AbstractC5023l7
    public final C4603j7 c(int i, Intent intent) {
        return new C4603j7(i, intent);
    }
}
