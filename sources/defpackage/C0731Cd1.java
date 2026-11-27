package defpackage;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;

/* JADX INFO: renamed from: Cd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0731Cd1 extends AbstractC5023l7<Lf2, Uri[]> {
    @Override // defpackage.AbstractC5023l7
    public final Intent a(Context context, Lf2 lf2) {
        List<ResolveInfo> listQueryIntentActivities;
        Lf2 input = lf2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        List<String> list = input.a.a;
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        String str = (String) CollectionsKt.W(list);
        if (str == null) {
            str = "*/*";
        }
        intent.setType(str);
        intent.putExtra("android.intent.extra.MIME_TYPES", (String[]) list.toArray(new String[0]));
        if (input.a.b) {
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        intent.addFlags(1);
        Uri uri = input.c;
        Pair pair = uri != null ? new Pair("android.media.action.IMAGE_CAPTURE", uri) : null;
        Uri uri2 = input.d;
        Pair[] elements = {pair, uri2 != null ? new Pair("android.media.action.VIDEO_CAPTURE", uri2) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList<Pair> arrayListO = C1526Mj.o(elements);
        ArrayList arrayList = new ArrayList();
        for (Pair pair2 : arrayListO) {
            String str2 = (String) pair2.d;
            Uri uri3 = (Uri) pair2.e;
            Intent intent2 = new Intent(str2);
            intent2.putExtra("output", uri3);
            intent2.setClipData(ClipData.newRawUri("", uri3));
            intent2.addFlags(3);
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
            AbstractC3248ct1 flags = AbstractC3248ct1.a;
            Intrinsics.checkNotNullParameter(packageManager, "<this>");
            Intrinsics.checkNotNullParameter(intent2, "intent");
            Intrinsics.checkNotNullParameter(flags, "flags");
            if (Build.VERSION.SDK_INT >= 33) {
                if (!(flags instanceof AbstractC3248ct1.b)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                listQueryIntentActivities = packageManager.queryIntentActivities(intent2, ((AbstractC3248ct1.b) flags).b);
                Intrinsics.checkNotNull(listQueryIntentActivities);
            } else {
                if (!(flags instanceof AbstractC3248ct1.a)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                ((AbstractC3248ct1.a) flags).getClass();
                listQueryIntentActivities = packageManager.queryIntentActivities(intent2, 0);
                Intrinsics.checkNotNull(listQueryIntentActivities);
            }
            ArrayList arrayList2 = new ArrayList(XE.m(listQueryIntentActivities, 10));
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                String str3 = resolveInfo.activityInfo.packageName;
                context.grantUriPermission(str3, uri3, 3);
                Intent intent3 = new Intent(intent2);
                intent3.setComponent(new ComponentName(str3, resolveInfo.activityInfo.name));
                arrayList2.add(intent3);
            }
            C2904bF.o(arrayList, arrayList2);
        }
        if (arrayList.isEmpty()) {
            return intent;
        }
        Intent intentCreateChooser = Intent.createChooser(intent, input.b);
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Intent[0]));
        Intrinsics.checkNotNullExpressionValue(intentCreateChooser, "apply(...)");
        return intentCreateChooser;
    }

    @Override // defpackage.AbstractC5023l7
    public final Uri[] c(int i, Intent intent) {
        Uri data;
        ClipData clipData;
        if (i != -1) {
            return null;
        }
        if (intent != null && (clipData = intent.getClipData()) != null) {
            IntRange intRangeI = f.i(0, clipData.getItemCount());
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = intRangeI.iterator();
            while (((DB0) it).hasNext()) {
                Uri uri = clipData.getItemAt(((CB0) it).b()).getUri();
                if (uri != null) {
                    arrayList.add(uri);
                }
            }
            if (!arrayList.isEmpty()) {
                return (Uri[]) arrayList.toArray(new Uri[0]);
            }
        }
        return (intent == null || (data = intent.getData()) == null) ? new Uri[0] : new Uri[]{data};
    }
}
