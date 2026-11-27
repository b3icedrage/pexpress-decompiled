package io.sentry.android.replay.viewhierarchy;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.text.Layout;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.pexpress.tool.R;
import defpackage.Y0;
import io.sentry.android.replay.util.f;
import io.sentry.android.replay.util.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@SuppressLint({"UseRequiresApi"})
@TargetApi(26)
public abstract class b {
    public final int a;
    public final int b;
    public final float c;
    public final boolean d;

    @Nullable
    public final Rect e;

    @Nullable
    public ArrayList f;

    public static final class a {
        /* JADX WARN: Code duplicated, block: B:121:0x0208  */
        /* JADX WARN: Code duplicated, block: B:124:0x020d  */
        /* JADX WARN: Code duplicated, block: B:135:0x0129 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:136:0x0149 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:137:0x0149 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:138:0x0142 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:38:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:40:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:41:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:43:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:44:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:46:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:51:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:53:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:54:0x00f8  */
        /* JADX WARN: Code duplicated, block: B:56:0x0101  */
        /* JADX WARN: Code duplicated, block: B:59:0x0119  */
        /* JADX WARN: Code duplicated, block: B:62:0x0124 A[LOOP:0: B:58:0x0117->B:62:0x0124, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:65:0x0138  */
        /* JADX WARN: Code duplicated, block: B:68:0x0144 A[LOOP:1: B:64:0x0136->B:68:0x0144, LOOP_END] */
        @NotNull
        public static b a(@NotNull View view, @Nullable b bVar, @NotNull Y0 options) {
            Pair pair;
            boolean z;
            boolean z2;
            boolean z3;
            Bitmap bitmap;
            int extendedPaddingTop;
            Object tag;
            String str;
            Class<?> superclass;
            CopyOnWriteArraySet copyOnWriteArraySet;
            Class<?> superclass2;
            CopyOnWriteArraySet copyOnWriteArraySet2;
            String lowerCase;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(view, "<this>");
            if (view.isAttachedToWindow() && view.getWindowVisibility() == 0) {
                Object parent = view;
                while (true) {
                    if (!(parent instanceof View)) {
                        Rect rect = new Rect();
                        pair = new Pair(Boolean.valueOf(view.getGlobalVisibleRect(rect, new Point())), rect);
                        break;
                    }
                    float transitionAlpha = Build.VERSION.SDK_INT >= 29 ? ((View) parent).getTransitionAlpha() : 1.0f;
                    View view2 = (View) parent;
                    if (view2.getAlpha() <= 0.0f || transitionAlpha <= 0.0f || view2.getVisibility() != 0) {
                        pair = new Pair(Boolean.FALSE, null);
                        break;
                    }
                    parent = view2.getParent();
                }
            } else {
                pair = new Pair(Boolean.FALSE, null);
            }
            boolean zBooleanValue = ((Boolean) pair.d).booleanValue();
            Rect rect2 = (Rect) pair.e;
            if (zBooleanValue) {
                Object tag2 = view.getTag();
                String str2 = tag2 instanceof String ? (String) tag2 : null;
                if (str2 != null) {
                    String lowerCase2 = str2.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    if (lowerCase2 == null || !StringsKt.C(lowerCase2, "sentry-unmask", false)) {
                        if (Intrinsics.a(view.getTag(R.id.sentry_privacy), "unmask")) {
                            options.g();
                        } else {
                            tag = view.getTag();
                            if (tag instanceof String) {
                                str = (String) tag;
                            } else {
                                str = null;
                            }
                            if (str != null) {
                                lowerCase = str.toLowerCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                                if (lowerCase == null && StringsKt.C(lowerCase, "sentry-mask", false)) {
                                    options.g();
                                } else if (Intrinsics.a(view.getTag(R.id.sentry_privacy), "mask")) {
                                    options.g();
                                } else {
                                    options.getClass();
                                    if (view.getParent() != null) {
                                        Intrinsics.checkNotNullExpressionValue(view.getParent(), "getParent(...)");
                                    }
                                    superclass = view.getClass();
                                    copyOnWriteArraySet = (CopyOnWriteArraySet) options.b;
                                    Intrinsics.checkNotNullExpressionValue(copyOnWriteArraySet, "getUnmaskViewClasses(...)");
                                    while (true) {
                                        if (superclass == null) {
                                            superclass2 = view.getClass();
                                            copyOnWriteArraySet2 = (CopyOnWriteArraySet) options.a;
                                            Intrinsics.checkNotNullExpressionValue(copyOnWriteArraySet2, "getMaskViewClasses(...)");
                                            while (true) {
                                                if (superclass2 != null) {
                                                    if (!copyOnWriteArraySet2.contains(superclass2.getName())) {
                                                        superclass2 = superclass2.getSuperclass();
                                                    }
                                                }
                                            }
                                        } else if (!copyOnWriteArraySet.contains(superclass.getName())) {
                                            superclass = superclass.getSuperclass();
                                        }
                                    }
                                }
                                z = true;
                            } else {
                                if (Intrinsics.a(view.getTag(R.id.sentry_privacy), "mask")) {
                                    options.g();
                                } else {
                                    options.getClass();
                                    if (view.getParent() != null) {
                                        Intrinsics.checkNotNullExpressionValue(view.getParent(), "getParent(...)");
                                    }
                                    superclass = view.getClass();
                                    copyOnWriteArraySet = (CopyOnWriteArraySet) options.b;
                                    Intrinsics.checkNotNullExpressionValue(copyOnWriteArraySet, "getUnmaskViewClasses(...)");
                                    while (true) {
                                        if (superclass == null) {
                                            superclass2 = view.getClass();
                                            copyOnWriteArraySet2 = (CopyOnWriteArraySet) options.a;
                                            Intrinsics.checkNotNullExpressionValue(copyOnWriteArraySet2, "getMaskViewClasses(...)");
                                            while (true) {
                                                if (superclass2 != null) {
                                                    if (!copyOnWriteArraySet2.contains(superclass2.getName())) {
                                                        superclass2 = superclass2.getSuperclass();
                                                    }
                                                }
                                            }
                                        } else if (!copyOnWriteArraySet.contains(superclass.getName())) {
                                            superclass = superclass.getSuperclass();
                                        }
                                    }
                                }
                                z = true;
                            }
                        }
                        z = false;
                    } else {
                        options.g();
                        z = false;
                    }
                } else {
                    if (Intrinsics.a(view.getTag(R.id.sentry_privacy), "unmask")) {
                        options.g();
                    } else {
                        tag = view.getTag();
                        if (tag instanceof String) {
                            str = (String) tag;
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            lowerCase = str.toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                            if (lowerCase == null) {
                                if (Intrinsics.a(view.getTag(R.id.sentry_privacy), "mask")) {
                                    options.g();
                                } else {
                                    options.getClass();
                                    if (view.getParent() != null) {
                                        Intrinsics.checkNotNullExpressionValue(view.getParent(), "getParent(...)");
                                    }
                                    superclass = view.getClass();
                                    copyOnWriteArraySet = (CopyOnWriteArraySet) options.b;
                                    Intrinsics.checkNotNullExpressionValue(copyOnWriteArraySet, "getUnmaskViewClasses(...)");
                                    while (true) {
                                        if (superclass == null) {
                                            superclass2 = view.getClass();
                                            copyOnWriteArraySet2 = (CopyOnWriteArraySet) options.a;
                                            Intrinsics.checkNotNullExpressionValue(copyOnWriteArraySet2, "getMaskViewClasses(...)");
                                            while (true) {
                                                if (superclass2 != null) {
                                                    if (!copyOnWriteArraySet2.contains(superclass2.getName())) {
                                                        superclass2 = superclass2.getSuperclass();
                                                    }
                                                }
                                            }
                                        } else if (!copyOnWriteArraySet.contains(superclass.getName())) {
                                            superclass = superclass.getSuperclass();
                                        }
                                    }
                                }
                                z = true;
                            } else {
                                if (Intrinsics.a(view.getTag(R.id.sentry_privacy), "mask")) {
                                    options.g();
                                } else {
                                    options.getClass();
                                    if (view.getParent() != null) {
                                        Intrinsics.checkNotNullExpressionValue(view.getParent(), "getParent(...)");
                                    }
                                    superclass = view.getClass();
                                    copyOnWriteArraySet = (CopyOnWriteArraySet) options.b;
                                    Intrinsics.checkNotNullExpressionValue(copyOnWriteArraySet, "getUnmaskViewClasses(...)");
                                    while (true) {
                                        if (superclass == null) {
                                            superclass2 = view.getClass();
                                            copyOnWriteArraySet2 = (CopyOnWriteArraySet) options.a;
                                            Intrinsics.checkNotNullExpressionValue(copyOnWriteArraySet2, "getMaskViewClasses(...)");
                                            while (true) {
                                                if (superclass2 != null) {
                                                    if (!copyOnWriteArraySet2.contains(superclass2.getName())) {
                                                        superclass2 = superclass2.getSuperclass();
                                                    }
                                                }
                                            }
                                        } else if (!copyOnWriteArraySet.contains(superclass.getName())) {
                                            superclass = superclass.getSuperclass();
                                        }
                                    }
                                }
                                z = true;
                            }
                        } else {
                            if (Intrinsics.a(view.getTag(R.id.sentry_privacy), "mask")) {
                                options.g();
                            } else {
                                options.getClass();
                                if (view.getParent() != null) {
                                    Intrinsics.checkNotNullExpressionValue(view.getParent(), "getParent(...)");
                                }
                                superclass = view.getClass();
                                copyOnWriteArraySet = (CopyOnWriteArraySet) options.b;
                                Intrinsics.checkNotNullExpressionValue(copyOnWriteArraySet, "getUnmaskViewClasses(...)");
                                while (true) {
                                    if (superclass == null) {
                                        superclass2 = view.getClass();
                                        copyOnWriteArraySet2 = (CopyOnWriteArraySet) options.a;
                                        Intrinsics.checkNotNullExpressionValue(copyOnWriteArraySet2, "getMaskViewClasses(...)");
                                        while (true) {
                                            if (superclass2 != null) {
                                                if (!copyOnWriteArraySet2.contains(superclass2.getName())) {
                                                    superclass2 = superclass2.getSuperclass();
                                                }
                                            }
                                        }
                                    } else if (!copyOnWriteArraySet.contains(superclass.getName())) {
                                        superclass = superclass.getSuperclass();
                                    }
                                }
                            }
                            z = true;
                        }
                    }
                    z = false;
                }
            } else {
                z = false;
            }
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                Layout layout = textView.getLayout();
                io.sentry.android.replay.util.a aVar = layout != null ? new io.sentry.android.replay.util.a(layout) : null;
                int currentTextColor = textView.getCurrentTextColor() | (-16777216);
                int totalPaddingLeft = textView.getTotalPaddingLeft();
                Intrinsics.checkNotNullParameter(textView, "<this>");
                try {
                    extendedPaddingTop = textView.getTotalPaddingTop();
                } catch (NullPointerException unused) {
                    extendedPaddingTop = textView.getExtendedPaddingTop();
                }
                textView.getX();
                textView.getY();
                return new d(aVar, Integer.valueOf(currentTextColor), totalPaddingLeft, extendedPaddingTop, textView.getWidth(), textView.getHeight(), textView.getElevation() + (bVar != null ? bVar.c : 0.0f), bVar, z, rect2);
            }
            boolean z4 = z;
            if (!(view instanceof ImageView)) {
                view.getX();
                view.getY();
                return new C0390b(view.getWidth(), view.getHeight(), (bVar != null ? bVar.c : 0.0f) + view.getElevation(), bVar, z4, rect2);
            }
            ImageView imageView = (ImageView) view;
            imageView.getX();
            imageView.getY();
            int width = imageView.getWidth();
            int height = imageView.getHeight();
            float elevation = (bVar != null ? bVar.c : 0.0f) + imageView.getElevation();
            if (z4) {
                Drawable drawable = imageView.getDrawable();
                if (drawable == null) {
                    z3 = false;
                } else {
                    if (!(drawable instanceof InsetDrawable ? true : drawable instanceof ColorDrawable ? true : drawable instanceof VectorDrawable ? true : drawable instanceof GradientDrawable) && (!(drawable instanceof BitmapDrawable) || ((bitmap = ((BitmapDrawable) drawable).getBitmap()) != null && !bitmap.isRecycled() && bitmap.getHeight() > 10 && bitmap.getWidth() > 10))) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                if (z3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            return new c(width, height, elevation, bVar, z2, rect2);
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.viewhierarchy.b$b, reason: collision with other inner class name */
    @StabilityInferred(parameters = 0)
    public static final class C0390b extends b {
    }

    @StabilityInferred(parameters = 0)
    public static final class c extends b {
    }

    @StabilityInferred(parameters = 0)
    public static final class d extends b {

        @Nullable
        public final l g;

        @Nullable
        public final Integer h;
        public final int i;
        public final int j;

        public d(@Nullable l lVar, @Nullable Integer num, int i, int i2, int i3, int i4, float f, @Nullable b bVar, boolean z, @Nullable Rect rect) {
            super(i3, i4, f, bVar, z, rect);
            this.g = lVar;
            this.h = num;
            this.i = i;
            this.j = i2;
        }
    }

    public b(int i, int i2, float f, b bVar, boolean z, Rect rect) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = z;
        this.e = rect;
    }

    public final void a(@NotNull f.c callback) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!((Boolean) callback.invoke(this)).booleanValue() || (arrayList = this.f) == null) {
            return;
        }
        Intrinsics.checkNotNull(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(callback);
        }
    }
}
