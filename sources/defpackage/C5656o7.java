package defpackage;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5656o7 extends AbstractC5023l7<String, Boolean> {
    @Override // defpackage.AbstractC5023l7
    public final Intent a(Context context, String str) {
        String input = str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        String[] input2 = {input};
        Intrinsics.checkNotNullParameter(input2, "input");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input2);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return intentPutExtra;
    }

    @Override // defpackage.AbstractC5023l7
    public final AbstractC5023l7.a<Boolean> b(Context context, String str) {
        String input = str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        if (C6333rM.checkSelfPermission(context, input) == 0) {
            return new AbstractC5023l7.a<>(Boolean.TRUE);
        }
        return null;
    }

    @Override // defpackage.AbstractC5023l7
    public final Boolean c(int i, Intent intent) {
        if (intent == null || i != -1) {
            return Boolean.FALSE;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        boolean z = false;
        if (intArrayExtra != null) {
            for (int i2 : intArrayExtra) {
                if (i2 == 0) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
