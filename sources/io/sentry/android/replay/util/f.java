package io.sentry.android.replay.util;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.C5653o60;
import defpackage.EnumC4403iP0;
import defpackage.ML0;
import defpackage.VE;
import defpackage.XO0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@SuppressLint({"UseKtx"})
public final class f implements Closeable {

    @NotNull
    public final Object d;

    @NotNull
    public final Object e;

    @NotNull
    public final Object g;

    public static final class a extends ML0 implements Function0<Bitmap> {
        public static final a d = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Bitmap invoke() {
            return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        }
    }

    public static final class b extends ML0 implements Function0<Paint> {
        public static final b d = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final Paint invoke() {
            return new Paint();
        }
    }

    public static final class c extends ML0 implements Function1<io.sentry.android.replay.viewhierarchy.b, Boolean> {
        public final /* synthetic */ Bitmap e;
        public final /* synthetic */ Matrix g;
        public final /* synthetic */ ArrayList h;
        public final /* synthetic */ Canvas i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Bitmap bitmap, Matrix matrix, ArrayList arrayList, Canvas canvas) {
            super(1);
            this.e = bitmap;
            this.g = matrix;
            this.h = arrayList;
            this.i = canvas;
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [fO0, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v12, types: [fO0, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v6, types: [fO0, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v6, types: [fO0, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(io.sentry.android.replay.viewhierarchy.b bVar) {
            Pair pair;
            Integer numF;
            List listC;
            io.sentry.android.replay.viewhierarchy.b node = bVar;
            Intrinsics.checkNotNullParameter(node, "node");
            if (node.d && node.a > 0 && node.b > 0) {
                Rect globalRect = node.e;
                if (globalRect == null) {
                    return Boolean.FALSE;
                }
                boolean z = node instanceof io.sentry.android.replay.viewhierarchy.b.c;
                int i = 1;
                int i2 = 0;
                int iIntValue = -16777216;
                f fVar = f.this;
                if (z) {
                    List listC2 = VE.c(globalRect);
                    fVar.getClass();
                    Bitmap bitmap = this.e;
                    if (!bitmap.isRecycled()) {
                        ?? r8 = fVar.d;
                        if (!((Bitmap) r8.getValue()).isRecycled()) {
                            Rect rect = new Rect(globalRect);
                            RectF rectF = new RectF(rect);
                            Matrix matrix = this.g;
                            if (matrix != null) {
                                matrix.mapRect(rectF);
                            }
                            rectF.round(rect);
                            ((Canvas) fVar.e.getValue()).drawBitmap(bitmap, rect, new Rect(0, 0, 1, 1), (Paint) null);
                            iIntValue = ((Bitmap) r8.getValue()).getPixel(0, 0);
                        }
                    }
                    pair = new Pair(listC2, Integer.valueOf(iIntValue));
                } else if (node instanceof io.sentry.android.replay.viewhierarchy.b.d) {
                    io.sentry.android.replay.viewhierarchy.b.d dVar = (io.sentry.android.replay.viewhierarchy.b.d) node;
                    l lVar = dVar.g;
                    iIntValue = ((lVar == null || (numF = lVar.f()) == null) && (numF = dVar.h) == null) ? -16777216 : numF.intValue();
                    Intrinsics.checkNotNullParameter(globalRect, "globalRect");
                    if (lVar == null) {
                        listC = VE.c(globalRect);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        int iE = lVar.e();
                        int i3 = 0;
                        while (i3 < iE) {
                            int iB = (int) lVar.b(i3, lVar.d(i3));
                            int iH = lVar.h(i3);
                            int iG = lVar.g(i3);
                            int iB2 = (int) lVar.b(i3, (iG - iH) + (iH > 0 ? i : i2));
                            if (iB2 == 0 && iG > 0) {
                                iB2 = ((int) lVar.b(i3, iG - 1)) + i;
                            }
                            int iA = lVar.a(i3);
                            int iC = lVar.c(i3);
                            Rect rect2 = new Rect();
                            int i4 = globalRect.left + dVar.i + iB;
                            rect2.left = i4;
                            rect2.right = (iB2 - iB) + i4;
                            int i5 = globalRect.top + dVar.j + iA;
                            rect2.top = i5;
                            rect2.bottom = (iC - iA) + i5;
                            arrayList.add(rect2);
                            i3++;
                            i = 1;
                            i2 = 0;
                        }
                        listC = arrayList;
                    }
                    pair = new Pair(listC, Integer.valueOf(iIntValue));
                } else {
                    pair = new Pair(VE.c(globalRect), -16777216);
                }
                List list = (List) pair.d;
                ((Paint) fVar.g.getValue()).setColor(((Number) pair.e).intValue());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.i.drawRoundRect(new RectF((Rect) it.next()), 10.0f, 10.0f, (Paint) fVar.g.getValue());
                }
                this.h.addAll(list);
            }
            return Boolean.TRUE;
        }
    }

    public static final class d extends ML0 implements Function0<Canvas> {
        public d() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [fO0, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final Canvas invoke() {
            return new Canvas((Bitmap) f.this.d.getValue());
        }
    }

    public f() {
        EnumC4403iP0 enumC4403iP0 = EnumC4403iP0.e;
        this.d = XO0.a(enumC4403iP0, a.d);
        this.e = XO0.a(enumC4403iP0, new d());
        this.g = XO0.a(enumC4403iP0, b.d);
    }

    @NotNull
    public final List<Rect> c(@NotNull Bitmap bitmap, @NotNull io.sentry.android.replay.viewhierarchy.b viewHierarchy, @Nullable Matrix matrix) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(viewHierarchy, "viewHierarchy");
        if (bitmap.isRecycled()) {
            return C5653o60.d;
        }
        ArrayList arrayList = new ArrayList();
        Canvas canvas = new Canvas(bitmap);
        if (matrix != null) {
            canvas.setMatrix(matrix);
        }
        viewHierarchy.a(new c(bitmap, matrix, arrayList, canvas));
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fO0, java.lang.Object] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ?? r0 = this.d;
        if (!r0.d() || ((Bitmap) r0.getValue()).isRecycled()) {
            return;
        }
        ((Bitmap) r0.getValue()).recycle();
    }
}
