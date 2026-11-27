package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: n7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5446n7 extends AbstractC5023l7<String[], Map<String, Boolean>> {
    @Override // defpackage.AbstractC5023l7
    public final Intent a(Context context, String[] strArr) {
        String[] input = strArr;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return intentPutExtra;
    }

    @Override // defpackage.AbstractC5023l7
    public final AbstractC5023l7.a<Map<String, Boolean>> b(Context context, String[] strArr) {
        String[] input = strArr;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.length == 0) {
            return new AbstractC5023l7.a<>(PW0.c());
        }
        for (String str : input) {
            if (C6333rM.checkSelfPermission(context, str) != 0) {
                return null;
            }
        }
        int iA = OW0.a(input.length);
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (String str2 : input) {
            linkedHashMap.put(str2, Boolean.TRUE);
        }
        return new AbstractC5023l7.a<>(linkedHashMap);
    }

    @Override // defpackage.AbstractC5023l7
    public final Map<String, Boolean> c(int i, Intent intent) {
        if (i != -1) {
            return PW0.c();
        }
        if (intent == null) {
            return PW0.c();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return PW0.c();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i2 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i2 == 0));
        }
        return PW0.j(CollectionsKt.j0(C1526Mj.o(stringArrayExtra), arrayList));
    }
}
