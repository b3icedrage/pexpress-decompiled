package defpackage;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatEditText;
import com.pexpress.tool.R;
import io.sentry.android.core.b0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class Cd2 {
    public static WeakHashMap<View, C5345me2> a = null;
    public static Field b = null;
    public static boolean c = false;
    public static final int[] d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final C7651xd2 e = new C7651xd2();
    public static final a f = new a();

    public static abstract class b<T> {
        public final int a;
        public final Class<T> b;
        public final int c;
        public final int d;

        public b(int i, Class<T> cls, int i2, int i3) {
            this.a = i;
            this.b = cls;
            this.d = i2;
            this.c = i3;
        }

        public abstract T a(View view);

        public abstract void b(View view, T t);

        /* JADX WARN: Multi-variable type inference failed */
        public final void c(View view, T t) {
            Object tag;
            R1 r1;
            if (Build.VERSION.SDK_INT >= this.c) {
                b(view, t);
                return;
            }
            if (Build.VERSION.SDK_INT >= this.c) {
                tag = a(view);
            } else {
                tag = view.getTag(this.a);
                if (!this.b.isInstance(tag)) {
                    tag = null;
                }
            }
            if (d(tag, t)) {
                View.AccessibilityDelegate accessibilityDelegateC = Cd2.c(view);
                if (accessibilityDelegateC == null) {
                    r1 = null;
                } else {
                    r1 = accessibilityDelegateC instanceof R1.a ? ((R1.a) accessibilityDelegateC).a : new R1(accessibilityDelegateC);
                }
                if (r1 == null) {
                    r1 = new R1();
                }
                Cd2.l(view, r1);
                view.setTag(this.a, t);
                Cd2.g(view, this.d);
            }
        }

        public abstract boolean d(T t, T t2);
    }

    public static class c {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    public static class d {

        public class a implements View.OnApplyWindowInsetsListener {
            public C3006bj2 a = null;
            public final /* synthetic */ View b;
            public final /* synthetic */ K81 c;

            public a(View view, K81 k81) {
                this.b = view;
                this.c = k81;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C3006bj2 c3006bj2G = C3006bj2.g(view, windowInsets);
                int i = Build.VERSION.SDK_INT;
                K81 k81 = this.c;
                if (i < 30) {
                    d.a(windowInsets, this.b);
                    if (c3006bj2G.equals(this.a)) {
                        return k81.N(view, c3006bj2G).f();
                    }
                }
                this.a = c3006bj2G;
                C3006bj2 c3006bj2N = k81.N(view, c3006bj2G);
                if (i >= 30) {
                    return c3006bj2N.f();
                }
                WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                c.c(view);
                return c3006bj2N.f();
            }
        }

        public static void a(@NonNull WindowInsets windowInsets, @NonNull View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static C3006bj2 b(@NonNull View view, @NonNull C3006bj2 c3006bj2, @NonNull Rect rect) {
            WindowInsets windowInsetsF = c3006bj2.f();
            if (windowInsetsF != null) {
                return C3006bj2.g(view, view.computeSystemWindowInsets(windowInsetsF, rect));
            }
            rect.setEmpty();
            return c3006bj2;
        }

        public static boolean c(@NonNull View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        public static boolean d(@NonNull View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        public static boolean e(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        public static boolean f(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static C3006bj2 j(@NonNull View view) {
            C3006bj2.e cVar;
            if (!C3006bj2.a.d || !view.isAttachedToWindow()) {
                return null;
            }
            try {
                Object obj = C3006bj2.a.a.get(view.getRootView());
                if (obj == null) {
                    return null;
                }
                Rect rect = (Rect) C3006bj2.a.b.get(obj);
                Rect rect2 = (Rect) C3006bj2.a.c.get(obj);
                if (rect == null || rect2 == null) {
                    return null;
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    cVar = new C3006bj2.d();
                } else {
                    cVar = i >= 29 ? new C3006bj2.c() : new C3006bj2.b();
                }
                cVar.e(LA0.b(rect.left, rect.top, rect.right, rect.bottom));
                cVar.g(LA0.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                C3006bj2 c3006bj2B = cVar.b();
                c3006bj2B.a.p(c3006bj2B);
                c3006bj2B.a.d(view.getRootView());
                return c3006bj2B;
            } catch (IllegalAccessException e) {
                b0.f("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
                return null;
            }
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(@NonNull View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f) {
            view.setElevation(f);
        }

        public static void t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        public static void u(@NonNull View view, K81 k81) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, k81);
            }
            if (k81 == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, k81));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f) {
            view.setTranslationZ(f);
        }

        public static void x(@NonNull View view, float f) {
            view.setZ(f);
        }

        public static boolean y(View view, int i) {
            return view.startNestedScroll(i);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    public static class e {
        public static C3006bj2 a(@NonNull View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C3006bj2 c3006bj2G = C3006bj2.g(null, rootWindowInsets);
            C3006bj2.k kVar = c3006bj2G.a;
            kVar.p(c3006bj2G);
            kVar.d(view.getRootView());
            return c3006bj2G;
        }

        public static int b(@NonNull View view) {
            return view.getScrollIndicators();
        }

        public static void c(@NonNull View view, int i) {
            view.setScrollIndicators(i);
        }

        public static void d(@NonNull View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    public static class f {
        public static void a(@NonNull View view) {
            view.cancelDragAndDrop();
        }

        public static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        public static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        public static void d(@NonNull View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        public static boolean e(@NonNull View view, ClipData clipData, @NonNull View.DragShadowBuilder dragShadowBuilder, Object obj, int i) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
        }

        public static void f(@NonNull View view, @NonNull View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    public static class g {
        public static void a(@NonNull View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        public static AutofillId b(View view) {
            return view.getAutofillId();
        }

        public static int c(View view) {
            return view.getImportantForAutofill();
        }

        public static int d(@NonNull View view) {
            return view.getNextClusterForwardId();
        }

        public static boolean e(@NonNull View view) {
            return view.hasExplicitFocusable();
        }

        public static boolean f(@NonNull View view) {
            return view.isFocusedByDefault();
        }

        public static boolean g(View view) {
            return view.isImportantForAutofill();
        }

        public static boolean h(@NonNull View view) {
            return view.isKeyboardNavigationCluster();
        }

        public static View i(@NonNull View view, View view2, int i) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        public static boolean j(@NonNull View view) {
            return view.restoreDefaultFocus();
        }

        public static void k(@NonNull View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void l(@NonNull View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        public static void m(View view, int i) {
            view.setImportantForAutofill(i);
        }

        public static void n(@NonNull View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        public static void o(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        public static void p(@NonNull View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static class h {
        public static void a(@NonNull View view, @NonNull final m mVar) {
            C2703aM1 c2703aM1 = (C2703aM1) view.getTag(R.id.tag_unhandled_key_listeners);
            if (c2703aM1 == null) {
                c2703aM1 = new C2703aM1();
                view.setTag(R.id.tag_unhandled_key_listeners, c2703aM1);
            }
            Objects.requireNonNull(mVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: Dd2
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return mVar.a();
                }
            };
            c2703aM1.put(mVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void e(@NonNull View view, @NonNull m mVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            C2703aM1 c2703aM1 = (C2703aM1) view.getTag(R.id.tag_unhandled_key_listeners);
            if (c2703aM1 == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c2703aM1.getOrDefault(mVar, null)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static <T> T f(View view, int i) {
            return (T) view.requireViewById(i);
        }

        public static void g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, C2246Vo c2246Vo) {
            view.setAutofillId(null);
        }

        public static void j(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    public static class i {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static ContentCaptureSession b(View view) {
            return view.getContentCaptureSession();
        }

        public static List<Rect> c(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void d(@NonNull View view, @NonNull Context context, @NonNull int[] iArr, AttributeSet attributeSet, @NonNull TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        public static void e(View view, EL el) {
            view.setContentCaptureSession(null);
        }

        public static void f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    public static class j {
        public static int a(View view) {
            return view.getImportantForContentCapture();
        }

        public static CharSequence b(View view) {
            return view.getStateDescription();
        }

        public static boolean c(View view) {
            return view.isImportantForContentCapture();
        }

        public static void d(View view, int i) {
            view.setImportantForContentCapture(i);
        }

        public static void e(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    public static final class k {
        public static String[] a(@NonNull View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static TL b(@NonNull View view, @NonNull TL tl) {
            ContentInfo contentInfoC = tl.a.c();
            Objects.requireNonNull(contentInfoC);
            ContentInfo contentInfoA = NL.a(contentInfoC);
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoA);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoA ? tl : new TL(new TL.d(contentInfoPerformReceiveContent));
        }

        public static void c(@NonNull View view, String[] strArr, InterfaceC3935g91 interfaceC3935g91) {
            if (interfaceC3935g91 == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new l(interfaceC3935g91));
            }
        }
    }

    public static final class l implements OnReceiveContentListener {

        @NonNull
        public final InterfaceC3935g91 a;

        public l(@NonNull InterfaceC3935g91 interfaceC3935g91) {
            this.a = interfaceC3935g91;
        }

        public final ContentInfo onReceiveContent(@NonNull View view, @NonNull ContentInfo contentInfo) {
            TL tl = new TL(new TL.d(contentInfo));
            TL tlA = this.a.a(view, tl);
            if (tlA == null) {
                return null;
            }
            if (tlA == tl) {
                return contentInfo;
            }
            ContentInfo contentInfoC = tlA.a.c();
            Objects.requireNonNull(contentInfoC);
            return NL.a(contentInfoC);
        }
    }

    public interface m {
        boolean a();
    }

    public static class n {
        public static final ArrayList<WeakReference<View>> d = new ArrayList<>();
        public WeakHashMap<View, Boolean> a = null;
        public SparseArray<WeakReference<View>> b = null;
        public WeakReference<KeyEvent> c = null;

        public static boolean b(@NonNull View view, @NonNull KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((m) arrayList.get(size)).a()) {
                    return true;
                }
            }
            return false;
        }

        public final View a(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.a;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View viewA = a(viewGroup.getChildAt(childCount), keyEvent);
                    if (viewA != null) {
                        return viewA;
                    }
                }
            }
            if (b(view, keyEvent)) {
                return view;
            }
            return null;
        }
    }

    @NonNull
    @Deprecated
    public static C5345me2 a(@NonNull View view) {
        if (a == null) {
            a = new WeakHashMap<>();
        }
        C5345me2 c5345me2 = a.get(view);
        if (c5345me2 != null) {
            return c5345me2;
        }
        C5345me2 c5345me3 = new C5345me2(view);
        a.put(view, c5345me3);
        return c5345me3;
    }

    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = n.d;
        n nVar = (n) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (nVar == null) {
            nVar = new n();
            view.setTag(R.id.tag_unhandled_key_event_manager, nVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = nVar.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = n.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (nVar.a == null) {
                            nVar.a = new WeakHashMap<>();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList<WeakReference<View>> arrayList3 = n.d;
                            View view2 = arrayList3.get(size).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                nVar.a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    nVar.a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        View viewA = nVar.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (nVar.b == null) {
                    nVar.b = new SparseArray<>();
                }
                nVar.b.put(keyCode, new WeakReference<>(viewA));
            }
        }
        return viewA != null;
    }

    public static View.AccessibilityDelegate c(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return i.a(view);
        }
        if (c) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static CharSequence d(@NonNull View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = h.b(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList e(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] f(@NonNull AppCompatEditText appCompatEditText) {
        return Build.VERSION.SDK_INT >= 31 ? k.a(appCompatEditText) : (String[]) appCompatEditText.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void g(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = d(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i2);
                if (z) {
                    accessibilityEventObtain.getText().add(d(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i2 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                        return;
                    } catch (AbstractMethodError e2) {
                        b0.d("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i2);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(d(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static TL h(@NonNull View view, @NonNull TL tl) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(tl);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return k.b(view, tl);
        }
        InterfaceC3935g91 interfaceC3935g91 = (InterfaceC3935g91) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC4145h91 interfaceC4145h91 = e;
        if (interfaceC3935g91 == null) {
            if (view instanceof InterfaceC4145h91) {
                interfaceC4145h91 = (InterfaceC4145h91) view;
            }
            return interfaceC4145h91.a(tl);
        }
        TL tlA = interfaceC3935g91.a(view, tl);
        if (tlA == null) {
            return null;
        }
        if (view instanceof InterfaceC4145h91) {
            interfaceC4145h91 = (InterfaceC4145h91) view;
        }
        return interfaceC4145h91.a(tlA);
    }

    public static void i(View view, int i2) {
        ArrayList arrayListE = e(view);
        for (int i3 = 0; i3 < arrayListE.size(); i3++) {
            if (((C5426n2.a) arrayListE.get(i3)).a() == i2) {
                arrayListE.remove(i3);
                return;
            }
        }
    }

    public static void j(@NonNull View view, @NonNull C5426n2.a aVar, InterfaceC6265r2 interfaceC6265r2) {
        R1 r1;
        C5426n2.a aVar2 = new C5426n2.a(null, aVar.b, null, interfaceC6265r2, aVar.c);
        View.AccessibilityDelegate accessibilityDelegateC = c(view);
        if (accessibilityDelegateC == null) {
            r1 = null;
        } else {
            r1 = accessibilityDelegateC instanceof R1.a ? ((R1.a) accessibilityDelegateC).a : new R1(accessibilityDelegateC);
        }
        if (r1 == null) {
            r1 = new R1();
        }
        l(view, r1);
        i(view, aVar2.a());
        e(view).add(aVar2);
        g(view, 0);
    }

    public static void k(@NonNull View view, @NonNull @SuppressLint({"ContextFirst"}) Context context, @NonNull int[] iArr, AttributeSet attributeSet, @NonNull TypedArray typedArray, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            i.d(view, context, iArr, attributeSet, typedArray, i2, 0);
        }
    }

    public static void l(@NonNull View view, R1 r1) {
        if (r1 == null && (c(view) instanceof R1.a)) {
            r1 = new R1();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(r1 == null ? null : r1.b);
    }

    public static void m(@NonNull View view, CharSequence charSequence) {
        new C8071zd2(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).c(view, charSequence);
        a aVar = f;
        if (charSequence == null) {
            aVar.d.remove(view);
            view.removeOnAttachStateChangeListener(aVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(aVar);
        } else {
            aVar.d.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(aVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
            }
        }
    }

    public static class a implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        public final WeakHashMap<View, Boolean> d = new WeakHashMap<>();

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.d.entrySet()) {
                    View key = entry.getKey();
                    boolean zBooleanValue = entry.getValue().booleanValue();
                    boolean z = key.isShown() && key.getWindowVisibility() == 0;
                    if (zBooleanValue != z) {
                        Cd2.g(key, z ? 16 : 32);
                        entry.setValue(Boolean.valueOf(z));
                    }
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
