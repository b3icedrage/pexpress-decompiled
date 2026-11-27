package defpackage;

import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.g;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Qo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1856Qo extends FragmentManager.FragmentLifecycleCallbacks {

    @NotNull
    public final C3790fV a;

    @NotNull
    public final DS0 b;

    public C1856Qo(@NotNull C3790fV track, @NotNull DS0 logger) {
        Intrinsics.checkNotNullParameter(track, "track");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.a = track;
        this.b = logger;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public final void onFragmentResumed(@NotNull FragmentManager fm, @NotNull Fragment f) {
        Object objA;
        Object objA2;
        CharSequence charSequenceLoadLabel;
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f, "f");
        super.onFragmentResumed(fm, f);
        String canonicalName = f.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = f.getClass().getSimpleName();
        }
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            objA = f.getResources().getResourceEntryName(f.getId());
        } catch (Throwable th) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            objA = C1795Pt1.a(th);
        }
        Throwable thA = C1717Ot1.a(objA);
        DS0 ds0 = this.b;
        if (thA != null) {
            ds0.error("Failed to get resource entry name: " + thA);
        }
        if (objA instanceof C1717Ot1.b) {
            objA = null;
        }
        String str = (String) objA;
        try {
            g activity = f.getActivity();
            if (activity != null) {
                Intrinsics.checkNotNullExpressionValue(activity, "activity");
                Intrinsics.checkNotNullParameter(activity, "<this>");
                PackageManager packageManager = activity.getPackageManager();
                ActivityInfo activityInfo = packageManager != null ? packageManager.getActivityInfo(activity.getComponentName(), UserVerificationMethods.USER_VERIFY_PATTERN) : null;
                if (activityInfo == null || (charSequenceLoadLabel = activityInfo.loadLabel(packageManager)) == null || (objA2 = charSequenceLoadLabel.toString()) == null) {
                    if (activityInfo != null) {
                        objA2 = activityInfo.name;
                    } else {
                        objA2 = null;
                    }
                }
            } else {
                objA2 = null;
            }
        } catch (Throwable th2) {
            C1717Ot1.a aVar3 = C1717Ot1.e;
            objA2 = C1795Pt1.a(th2);
        }
        Throwable thA2 = C1717Ot1.a(objA2);
        if (thA2 != null) {
            ds0.error("Failed to get screen name: " + thA2);
        }
        this.a.invoke("[Amplitude] Fragment Viewed", PW0.e(new Pair("[Amplitude] Fragment Class", canonicalName), new Pair("[Amplitude] Fragment Identifier", str), new Pair("[Amplitude] Screen Name", (String) (objA2 instanceof C1717Ot1.b ? null : objA2)), new Pair("[Amplitude] Fragment Tag", f.getTag())));
    }
}
