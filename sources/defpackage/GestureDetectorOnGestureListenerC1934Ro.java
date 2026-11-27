package defpackage;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ro, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class GestureDetectorOnGestureListenerC1934Ro implements GestureDetector.OnGestureListener {

    @NotNull
    public final C4000gV d;

    @NotNull
    public final DS0 e;

    @NotNull
    public final List<InterfaceC7445we2> g;

    @NotNull
    public final WeakReference<Activity> h;

    /* JADX INFO: renamed from: Ro$a */
    public static final class a extends ML0 implements Function1<String, CharSequence> {
        public static final a d = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.length() <= 0) {
                return it;
            }
            StringBuilder sb = new StringBuilder();
            String strValueOf = String.valueOf(it.charAt(0));
            Intrinsics.c(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            sb.append((Object) upperCase);
            String strSubstring = it.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            sb.append(strSubstring);
            return sb.toString();
        }
    }

    public GestureDetectorOnGestureListenerC1934Ro(@NotNull Activity activity, @NotNull C4000gV track, @NotNull DS0 logger, @NotNull List viewTargetLocators) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(track, "track");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(viewTargetLocators, "viewTargetLocators");
        this.d = track;
        this.e = logger;
        this.g = viewTargetLocators;
        this.h = new WeakReference<>(activity);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(@NotNull MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(@Nullable MotionEvent motionEvent, @NotNull MotionEvent e2, float f, float f2) {
        Intrinsics.checkNotNullParameter(e2, "e2");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(@NotNull MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(@Nullable MotionEvent motionEvent, @NotNull MotionEvent e2, float f, float f2) {
        Intrinsics.checkNotNullParameter(e2, "e2");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(@NotNull MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(@NotNull MotionEvent e) {
        Window window;
        View decorView;
        CharSequence charSequenceLoadLabel;
        String string;
        Intrinsics.checkNotNullParameter(e, "e");
        WeakReference<Activity> weakReference = this.h;
        Activity activity = weakReference.get();
        DS0 ds0 = this.e;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            ds0.error("DecorView is null in onSingleTapUp()");
            Unit unit = Unit.a;
            return false;
        }
        Pair targetPosition = new Pair(Float.valueOf(e.getX()), Float.valueOf(e.getY()));
        C6814te2.a targetType = C6814te2.a.d;
        Intrinsics.checkNotNullParameter(decorView, "<this>");
        Intrinsics.checkNotNullParameter(targetPosition, "targetPosition");
        List<InterfaceC7445we2> viewTargetLocators = this.g;
        Intrinsics.checkNotNullParameter(viewTargetLocators, "viewTargetLocators");
        Intrinsics.checkNotNullParameter(targetType, "targetType");
        DS0 logger = this.e;
        Intrinsics.checkNotNullParameter(logger, "logger");
        C6814te2 c6814te2 = (C6814te2) C5189lv.o(new Md2(null, logger, decorView, viewTargetLocators, targetPosition));
        if (c6814te2 == null) {
            ds0.warn("Unable to find click target. No event captured.");
            Unit unit2 = Unit.a;
            return false;
        }
        Pair pair = new Pair("[Amplitude] Action", "touch");
        Pair pair2 = new Pair("[Amplitude] Target Class", c6814te2.b);
        Pair pair3 = new Pair("[Amplitude] Target Resource", c6814te2.c);
        Pair pair4 = new Pair("[Amplitude] Target Tag", c6814te2.d);
        Pair pair5 = new Pair("[Amplitude] Target Text", c6814te2.e);
        Pair pair6 = new Pair("[Amplitude] Target Source", CollectionsKt.J(StringsKt__StringsKt.split$default(d.m(c6814te2.f, "_", " "), new String[]{" "}, false, 0, 6, null), " ", null, null, a.d, 30));
        Pair pair7 = new Pair("[Amplitude] Hierarchy", c6814te2.g);
        String str = null;
        try {
            Activity activity2 = weakReference.get();
            if (activity2 != null) {
                Intrinsics.checkNotNullParameter(activity2, "<this>");
                PackageManager packageManager = activity2.getPackageManager();
                ActivityInfo activityInfo = packageManager != null ? packageManager.getActivityInfo(activity2.getComponentName(), UserVerificationMethods.USER_VERIFY_PATTERN) : null;
                if (activityInfo != null && (charSequenceLoadLabel = activityInfo.loadLabel(packageManager)) != null && (string = charSequenceLoadLabel.toString()) != null) {
                    str = string;
                } else if (activityInfo != null) {
                    str = activityInfo.name;
                }
            }
        } catch (Exception e2) {
            ds0.error("Error getting screen name: " + e2);
        }
        this.d.invoke("[Amplitude] Element Interacted", PW0.e(pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("[Amplitude] Screen Name", str)));
        return false;
    }
}
