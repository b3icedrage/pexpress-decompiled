package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class VP0 extends AbstractC3776fQ0 {
    public UP0 i;
    public Paint j;
    public WeakReference<Bitmap> k;
    public Canvas l;
    public Bitmap.Config m;
    public Path n;
    public Path o;
    public float[] p;
    public Path q;
    public HashMap<InterfaceC6653ss0, a> r;
    public float[] s;

    public class a {
        public final Path a = new Path();
        public Bitmap[] b;

        public a() {
        }
    }

    /* JADX WARN: Code duplicated, block: B:127:0x036e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15, types: [e70, zq] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v7, types: [e70, zq] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [e70, zq] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r24v2, types: [e70, zq] */
    /* JADX WARN: Type inference failed for: r24v3, types: [zq] */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r2v12, types: [e70, zq] */
    /* JADX WARN: Type inference failed for: r2v13, types: [e70, zq] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v27, types: [e70, zq] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r4v13, types: [e70, zq] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v5, types: [e70, zq] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [e70, zq] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r7v21, types: [e70, zq] */
    /* JADX WARN: Type inference failed for: r7v28, types: [e70, zq] */
    /* JADX WARN: Type inference failed for: r7v48, types: [e70, zq] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23, types: [e70] */
    /* JADX WARN: Type inference failed for: r9v29, types: [e70, zq] */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v33 */
    @Override // defpackage.AbstractC8032zS
    public final void b(Canvas canvas) {
        Paint paint;
        B42 b42;
        PathEffect pathEffect;
        InterfaceC3876ft0 interfaceC3876ft0;
        B42 b43;
        int i;
        int i2;
        int i3;
        PathEffect pathEffect2;
        int i4;
        YP0.a aVar;
        int i5;
        int i6 = 3;
        int i7 = 2;
        int i8 = 1;
        C4454ie2 c4454ie2 = (C4454ie2) this.b;
        int i9 = (int) c4454ie2.c;
        int i10 = (int) c4454ie2.d;
        WeakReference<Bitmap> weakReference = this.k;
        Bitmap bitmapCreateBitmap = weakReference == null ? null : weakReference.get();
        if (bitmapCreateBitmap == null || bitmapCreateBitmap.getWidth() != i9 || bitmapCreateBitmap.getHeight() != i10) {
            if (i9 <= 0 || i10 <= 0) {
                return;
            }
            bitmapCreateBitmap = Bitmap.createBitmap(i9, i10, this.m);
            this.k = new WeakReference<>(bitmapCreateBitmap);
            this.l = new Canvas(bitmapCreateBitmap);
        }
        Bitmap bitmap = bitmapCreateBitmap;
        int i11 = 0;
        bitmap.eraseColor(0);
        UP0 up0 = this.i;
        Iterator it = up0.getLineData().i.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            Paint paint2 = this.d;
            if (!zHasNext) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                return;
            }
            InterfaceC3876ft0 interfaceC3876ft1 = (InterfaceC3876ft0) it.next();
            if (!interfaceC3876ft1.isVisible() || interfaceC3876ft1.T() < i8) {
                up0 = up0;
            } else {
                paint2.setStrokeWidth(interfaceC3876ft1.h());
                paint2.setPathEffect(interfaceC3876ft1.r());
                int iOrdinal = interfaceC3876ft1.C().ordinal();
                Path path = this.o;
                Path path2 = this.n;
                AbstractC5597nq.a aVar2 = this.g;
                C7558xA c7558xA = this.c;
                if (iOrdinal == i7) {
                    bitmap = bitmap;
                    i6 = i6;
                    i7 = i7;
                    up0 = up0;
                    paint = paint2;
                    int i12 = i11;
                    c7558xA.getClass();
                    B42 b42I = up0.i(interfaceC3876ft1.S());
                    aVar2.a(up0, interfaceC3876ft1);
                    float fQ = interfaceC3876ft1.q();
                    path2.reset();
                    if (aVar2.c >= 1) {
                        int i13 = aVar2.a;
                        Object objY = interfaceC3876ft1.y(Math.max(i13 - 1, i12));
                        ?? Y = interfaceC3876ft1.y(Math.max(i13, i12));
                        if (Y != 0) {
                            path2.moveTo(Y.b(), Y.a() * 1.0f);
                            i8 = 1;
                            int i14 = aVar2.a + 1;
                            ?? r15 = Y;
                            int i15 = -1;
                            ?? r5 = Y;
                            ?? r13 = objY;
                            while (true) {
                                ?? Y2 = r5;
                                if (i14 > aVar2.c + aVar2.a) {
                                    break;
                                }
                                if (i15 != i14) {
                                    Y2 = interfaceC3876ft1.y(i14);
                                }
                                int i16 = i14 + 1;
                                if (i16 < interfaceC3876ft1.T()) {
                                    i14 = i16;
                                }
                                ?? Y3 = interfaceC3876ft1.y(i14);
                                Path path3 = path2;
                                path3.cubicTo(r15.b() + ((Y2.b() - r13.b()) * fQ), (r15.a() + ((Y2.a() - r13.a()) * fQ)) * 1.0f, Y2.b() - ((Y3.b() - r15.b()) * fQ), (Y2.a() - ((Y3.a() - r15.a()) * fQ)) * 1.0f, Y2.b(), Y2.a() * 1.0f);
                                int i17 = i14;
                                i14 = i16;
                                i15 = i17;
                                r13 = r15;
                                path2 = path3;
                                r15 = Y2;
                                r5 = Y3;
                            }
                        }
                        paint.setPathEffect(pathEffect);
                    } else {
                        i8 = 1;
                    }
                    if (interfaceC3876ft1.A()) {
                        path.reset();
                        path.addPath(path2);
                        b42 = b42I;
                        h(this.l, interfaceC3876ft1, path, b42, this.g);
                    } else {
                        b42 = b42I;
                    }
                    paint.setColor(interfaceC3876ft1.V());
                    paint.setStyle(Paint.Style.STROKE);
                    b42.d(path2);
                    this.l.drawPath(path2, paint);
                    pathEffect = null;
                    paint.setPathEffect(null);
                    paint.setPathEffect(pathEffect);
                } else if (iOrdinal != i6) {
                    int iT = interfaceC3876ft1.T();
                    YP0.a aVarC = interfaceC3876ft1.C();
                    YP0.a aVar3 = YP0.a.e;
                    int i18 = aVarC == aVar3 ? i8 : i11;
                    i6 = i6;
                    if (i18 != 0) {
                        i7 = i7;
                        i = 4;
                    } else {
                        i = i7;
                        i7 = i;
                    }
                    B42 b42I2 = up0.i(interfaceC3876ft1.S());
                    c7558xA.getClass();
                    paint2.setStyle(Paint.Style.STROKE);
                    Canvas canvas2 = interfaceC3876ft1.j() ? this.l : canvas;
                    aVar2.a(up0, interfaceC3876ft1);
                    if (!interfaceC3876ft1.A() || iT <= 0) {
                        i2 = i11;
                        i3 = i8;
                    } else {
                        i2 = i11;
                        Path path4 = this.q;
                        i3 = i8;
                        int i19 = aVar2.a;
                        int i20 = aVar2.c + i19;
                        int i21 = i2;
                        while (true) {
                            int i22 = (i21 * UserVerificationMethods.USER_VERIFY_PATTERN) + i19;
                            int i23 = i21;
                            int i24 = i22 + UserVerificationMethods.USER_VERIFY_PATTERN;
                            if (i24 > i20) {
                                i24 = i20;
                            }
                            if (i22 <= i24) {
                                interfaceC3876ft1.f().getClass();
                                i4 = i20;
                                float fM = C0564Aa.m(interfaceC3876ft1, up0);
                                i5 = i19;
                                int i25 = interfaceC3876ft1.C() == aVar3 ? i3 : i2;
                                path4.reset();
                                ?? Y4 = interfaceC3876ft1.y(i22);
                                aVar = aVar3;
                                path4.moveTo(Y4.b(), fM);
                                int i26 = i25;
                                path4.lineTo(Y4.b(), Y4.a() * 1.0f);
                                int i27 = i22 + 1;
                                ?? r9 = 0;
                                ?? r24 = Y4;
                                while (i27 <= i24) {
                                    ?? Y5 = interfaceC3876ft1.y(i27);
                                    if (i26 != 0) {
                                        path4.lineTo(Y5.b(), r24.a() * 1.0f);
                                    }
                                    path4.lineTo(Y5.b(), Y5.a() * 1.0f);
                                    i27++;
                                    ?? r10 = Y5;
                                    r24 = r10;
                                    r9 = r10;
                                }
                                if (r9 != 0) {
                                    path4.lineTo(r9.b(), fM);
                                }
                                path4.close();
                                b42I2.d(path4);
                                Drawable drawableS = interfaceC3876ft1.s();
                                if (drawableS != null) {
                                    g(canvas, path4, drawableS);
                                } else {
                                    int iC = (interfaceC3876ft1.c() & 16777215) | (interfaceC3876ft1.d() << 24);
                                    DisplayMetrics displayMetrics = AbstractC8067zc2.a;
                                    int iSave = canvas.save();
                                    canvas.clipPath(path4);
                                    canvas.drawColor(iC);
                                    canvas.restoreToCount(iSave);
                                }
                            } else {
                                i4 = i20;
                                aVar = aVar3;
                                i5 = i19;
                            }
                            int i28 = i23 + 1;
                            if (i22 > i24) {
                                break;
                            }
                            i21 = i28;
                            i20 = i4;
                            i19 = i5;
                            aVar3 = aVar;
                        }
                    }
                    if (interfaceC3876ft1.H().size() > i3) {
                        int i29 = i * 2;
                        if (this.p.length <= i29) {
                            this.p = new float[i * 4];
                        }
                        int i30 = aVar2.a;
                        while (i30 <= aVar2.c + aVar2.a) {
                            ?? Y6 = interfaceC3876ft1.y(i30);
                            if (Y6 != 0) {
                                this.p[i2] = Y6.b();
                                this.p[1] = Y6.a() * 1.0f;
                                if (i30 < aVar2.b) {
                                    ?? Y7 = interfaceC3876ft1.y(i30 + 1);
                                    if (Y7 == 0) {
                                        break;
                                    }
                                    if (i18 != 0) {
                                        this.p[i7] = Y7.b();
                                        float[] fArr = this.p;
                                        float f = fArr[1];
                                        fArr[i6] = f;
                                        fArr[4] = fArr[i7];
                                        fArr[5] = f;
                                        fArr[6] = Y7.b();
                                        this.p[7] = Y7.a() * 1.0f;
                                    } else {
                                        this.p[i7] = Y7.b();
                                        this.p[i6] = Y7.a() * 1.0f;
                                    }
                                } else {
                                    float[] fArr2 = this.p;
                                    fArr2[i7] = fArr2[i2];
                                    fArr2[i6] = fArr2[1];
                                }
                                b42I2.f(this.p);
                                if (!c4454ie2.f(this.p[i2])) {
                                    break;
                                }
                                if (c4454ie2.e(this.p[i7]) && (c4454ie2.g(this.p[1]) || c4454ie2.d(this.p[i6]))) {
                                    paint2.setColor(interfaceC3876ft1.D(i30));
                                    canvas2.drawLines(this.p, i2, i29, paint2);
                                }
                            }
                            i30++;
                            i2 = 0;
                        }
                        pathEffect2 = null;
                    } else {
                        int i31 = iT * i;
                        if (this.p.length < Math.max(i31, i) * 2) {
                            this.p = new float[Math.max(i31, i) * 4];
                        }
                        if (interfaceC3876ft1.y(aVar2.a) != null) {
                            int i32 = aVar2.a;
                            int i33 = 0;
                            while (i32 <= aVar2.c + aVar2.a) {
                                ?? Y8 = interfaceC3876ft1.y(i32 == 0 ? 0 : i32 - 1);
                                ?? Y9 = interfaceC3876ft1.y(i32);
                                if (Y8 != 0 && Y9 != 0) {
                                    this.p[i33] = Y8.b();
                                    int i34 = i33 + 2;
                                    this.p[i33 + 1] = Y8.a() * 1.0f;
                                    if (i18 != 0) {
                                        this.p[i34] = Y9.b();
                                        this.p[i33 + 3] = Y8.a() * 1.0f;
                                        this.p[i33 + 4] = Y9.b();
                                        i34 = i33 + 6;
                                        this.p[i33 + 5] = Y8.a() * 1.0f;
                                    }
                                    this.p[i34] = Y9.b();
                                    this.p[i34 + 1] = Y9.a() * 1.0f;
                                    i33 = i34 + 2;
                                }
                                i32++;
                            }
                            if (i33 > 0) {
                                b42I2.f(this.p);
                                int iMax = Math.max((aVar2.c + 1) * i, i) * 2;
                                paint2.setColor(interfaceC3876ft1.V());
                                canvas2.drawLines(this.p, 0, iMax, paint2);
                            }
                        }
                        pathEffect2 = null;
                    }
                    paint2.setPathEffect(pathEffect2);
                    up0 = up0;
                    paint = paint2;
                    bitmap = bitmap;
                } else {
                    bitmap = bitmap;
                    i6 = i6;
                    i7 = i7;
                    c7558xA.getClass();
                    B42 b42I3 = up0.i(interfaceC3876ft1.S());
                    aVar2.a(up0, interfaceC3876ft1);
                    path2.reset();
                    if (aVar2.c >= 1) {
                        ?? Y10 = interfaceC3876ft1.y(aVar2.a);
                        path2.moveTo(Y10.b(), Y10.a() * 1.0f);
                        int i35 = aVar2.a + 1;
                        ?? r2 = Y10;
                        while (i35 <= aVar2.c + aVar2.a) {
                            ?? Y11 = interfaceC3876ft1.y(i35);
                            float fB = ((Y11.b() - r2.b()) / 2.0f) + r2.b();
                            path2.cubicTo(fB, r2.a() * 1.0f, fB, Y11.a() * 1.0f, Y11.b(), Y11.a() * 1.0f);
                            i35++;
                            r2 = Y11;
                        }
                    }
                    if (interfaceC3876ft1.A()) {
                        path.reset();
                        path.addPath(path2);
                        interfaceC3876ft0 = interfaceC3876ft1;
                        b43 = b42I3;
                        paint = paint2;
                        h(this.l, interfaceC3876ft0, path, b43, this.g);
                    } else {
                        interfaceC3876ft0 = interfaceC3876ft1;
                        paint = paint2;
                        b43 = b42I3;
                    }
                    paint.setColor(interfaceC3876ft0.V());
                    paint.setStyle(Paint.Style.STROKE);
                    b43.d(path2);
                    this.l.drawPath(path2, paint);
                    paint.setPathEffect(null);
                }
                pathEffect = null;
                i8 = 1;
                paint.setPathEffect(pathEffect);
            }
            bitmap = bitmap;
            up0 = up0;
            i6 = i6;
            i7 = i7;
            i8 = i8;
            i11 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0134  */
    /* JADX WARN: Code duplicated, block: B:51:0x013d  */
    /* JADX WARN: Code duplicated, block: B:54:0x015c  */
    /* JADX WARN: Code duplicated, block: B:58:0x016c  */
    /* JADX WARN: Code duplicated, block: B:73:0x013a A[EDGE_INSN: B:73:0x013a->B:50:0x013a BREAK  A[LOOP:2: B:47:0x0132->B:62:0x0184], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x013a A[EDGE_INSN: B:74:0x013a->B:50:0x013a BREAK  A[LOOP:2: B:47:0x0132->B:62:0x0184], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v3, types: [e70, zq] */
    @Override // defpackage.AbstractC8032zS
    public final void c(Canvas canvas) {
        int i;
        UP0 up0;
        ArrayList arrayList;
        int i2;
        a aVar;
        int i3;
        int i4;
        ?? Y;
        float f;
        C4454ie2 c4454ie2;
        this.d.setStyle(Paint.Style.FILL);
        this.c.getClass();
        float[] fArr = this.s;
        int i5 = 0;
        float f2 = 0.0f;
        fArr[0] = 0.0f;
        int i6 = 1;
        fArr[1] = 0.0f;
        UP0 up1 = this.i;
        ArrayList arrayList2 = up1.getLineData().i;
        int i7 = 0;
        while (i7 < arrayList2.size()) {
            InterfaceC3876ft0 interfaceC3876ft0 = (InterfaceC3876ft0) arrayList2.get(i7);
            if (interfaceC3876ft0.isVisible() && interfaceC3876ft0.W() && interfaceC3876ft0.T() != 0) {
                this.j.setColor(interfaceC3876ft0.m());
                B42 b42I = up1.i(interfaceC3876ft0.S());
                AbstractC5597nq.a aVar2 = this.g;
                aVar2.a(up1, interfaceC3876ft0);
                float fZ = interfaceC3876ft0.z();
                float fZ2 = interfaceC3876ft0.Z();
                int i8 = (!interfaceC3876ft0.c0() || fZ2 >= fZ || fZ2 <= f2) ? i5 : i6;
                int i9 = (i8 == 0 || interfaceC3876ft0.m() != 1122867) ? i5 : i6;
                HashMap<InterfaceC6653ss0, a> map = this.r;
                if (map.containsKey(interfaceC3876ft0)) {
                    aVar = map.get(interfaceC3876ft0);
                } else {
                    a aVar3 = new a();
                    map.put(interfaceC3876ft0, aVar3);
                    aVar = aVar3;
                }
                aVar.getClass();
                int iB = interfaceC3876ft0.b();
                i = i5;
                Bitmap[] bitmapArr = aVar.b;
                if (bitmapArr == null) {
                    aVar.b = new Bitmap[iB];
                } else {
                    if (bitmapArr.length != iB) {
                        aVar.b = new Bitmap[iB];
                    }
                    up0 = up1;
                    arrayList = arrayList2;
                    i2 = i7;
                    int i10 = aVar2.c;
                    i3 = aVar2.a;
                    i4 = i10 + i3;
                    while (i3 <= i4) {
                        Y = interfaceC3876ft0.y(i3);
                        if (Y == 0) {
                            break;
                        }
                        fArr[i] = Y.b();
                        fArr[i6] = Y.a() * 1.0f;
                        b42I.f(fArr);
                        f = fArr[i];
                        c4454ie2 = (C4454ie2) this.b;
                        if (!c4454ie2.f(f)) {
                            break;
                        }
                        if (!c4454ie2.e(fArr[i]) && c4454ie2.i(fArr[i6])) {
                            Bitmap[] bitmapArr2 = aVar.b;
                            Bitmap bitmap = bitmapArr2[i3 % bitmapArr2.length];
                            if (bitmap != null) {
                                canvas.drawBitmap(bitmap, fArr[i] - fZ, fArr[i6] - fZ, (Paint) null);
                            }
                        }
                        i3++;
                    }
                }
                int iB2 = interfaceC3876ft0.b();
                float fZ3 = interfaceC3876ft0.z();
                float fZ4 = interfaceC3876ft0.Z();
                int i11 = i;
                while (i11 < iB2) {
                    int i12 = iB2;
                    UP0 up2 = up1;
                    ArrayList arrayList3 = arrayList2;
                    int i13 = (int) (((double) fZ3) * 2.1d);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i13, i13, Bitmap.Config.ARGB_4444);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    aVar.b[i11] = bitmapCreateBitmap;
                    VP0 vp0 = VP0.this;
                    int i14 = i7;
                    vp0.d.setColor(interfaceC3876ft0.R(i11));
                    Paint paint = vp0.d;
                    if (i9 != 0) {
                        Path path = aVar.a;
                        path.reset();
                        path.addCircle(fZ3, fZ3, fZ3, Path.Direction.CW);
                        path.addCircle(fZ3, fZ3, fZ4, Path.Direction.CCW);
                        canvas2.drawPath(path, paint);
                    } else {
                        canvas2.drawCircle(fZ3, fZ3, fZ3, paint);
                        if (i8 != 0) {
                            canvas2.drawCircle(fZ3, fZ3, fZ4, vp0.j);
                        }
                    }
                    i11++;
                    iB2 = i12;
                    up1 = up2;
                    arrayList2 = arrayList3;
                    i7 = i14;
                }
                up0 = up1;
                arrayList = arrayList2;
                i2 = i7;
                int i15 = aVar2.c;
                i3 = aVar2.a;
                i4 = i15 + i3;
                while (i3 <= i4) {
                    Y = interfaceC3876ft0.y(i3);
                    if (Y == 0) {
                        break;
                        break;
                    }
                    fArr[i] = Y.b();
                    fArr[i6] = Y.a() * 1.0f;
                    b42I.f(fArr);
                    f = fArr[i];
                    c4454ie2 = (C4454ie2) this.b;
                    if (!c4454ie2.f(f)) {
                        break;
                        break;
                    } else {
                        if (!c4454ie2.e(fArr[i])) {
                        }
                        i3++;
                    }
                }
            } else {
                i = i5;
                i6 = i6;
                up0 = up1;
                arrayList = arrayList2;
                i2 = i7;
            }
            i7 = i2 + 1;
            i5 = i;
            i6 = i6;
            up1 = up0;
            arrayList2 = arrayList;
            f2 = 0.0f;
        }
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [e70, zq] */
    @Override // defpackage.AbstractC8032zS
    public final void d(Canvas canvas, C7482wo0[] c7482wo0Arr) {
        ?? I;
        UP0 up0 = this.i;
        WP0 lineData = up0.getLineData();
        for (C7482wo0 c7482wo0 : c7482wo0Arr) {
            InterfaceC3876ft0 interfaceC3876ft0 = (InterfaceC3876ft0) lineData.e(c7482wo0.f);
            if (interfaceC3876ft0 != null && interfaceC3876ft0.X() && (I = interfaceC3876ft0.i(c7482wo0.a, c7482wo0.b)) != 0) {
                float fP = interfaceC3876ft0.p(I);
                float fT = interfaceC3876ft0.T();
                this.c.getClass();
                if (fP < fT * 1.0f) {
                    B42 b42I = up0.i(interfaceC3876ft0.S());
                    float fB = I.b();
                    float fA = I.a();
                    this.c.getClass();
                    C3581eV0 c3581eV0A = b42I.a(fB, fA * 1.0f);
                    float f = (float) c3581eV0A.e;
                    float f2 = (float) c3581eV0A.g;
                    c7482wo0.h = f;
                    c7482wo0.i = f2;
                    this.e.setColor(interfaceC3876ft0.Q());
                    this.e.setStrokeWidth(interfaceC3876ft0.n());
                    this.e.setPathEffect(null);
                    boolean zY = interfaceC3876ft0.Y();
                    Path path = this.h;
                    C4454ie2 c4454ie2 = (C4454ie2) this.b;
                    if (zY) {
                        path.reset();
                        path.moveTo(f, c4454ie2.b.top);
                        path.lineTo(f, c4454ie2.b.bottom);
                        canvas.drawPath(path, this.e);
                    }
                    if (interfaceC3876ft0.a0()) {
                        path.reset();
                        path.moveTo(c4454ie2.b.left, f2);
                        path.lineTo(c4454ie2.b.right, f2);
                        canvas.drawPath(path, this.e);
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r15v8, types: [e70, zq] */
    /* JADX WARN: Type inference failed for: r4v5, types: [e70, zq] */
    @Override // defpackage.AbstractC8032zS
    public final void e(Canvas canvas) {
        UP0 up0;
        ArrayList arrayList;
        int i;
        UP0 up1 = this.i;
        if (((float) up1.getData().h()) < ((float) up1.getMaxVisibleCount()) * ((C4454ie2) this.b).i) {
            ArrayList arrayList2 = up1.getLineData().i;
            int i2 = 0;
            while (i2 < arrayList2.size()) {
                InterfaceC3876ft0 interfaceC3876ft0 = (InterfaceC3876ft0) arrayList2.get(i2);
                if (!(interfaceC3876ft0.isVisible() && (interfaceC3876ft0.N() || interfaceC3876ft0.k())) || interfaceC3876ft0.T() < 1) {
                    up0 = up1;
                    arrayList = arrayList2;
                    i = i2;
                } else {
                    Paint paint = this.f;
                    paint.setTypeface(null);
                    paint.setTextSize(interfaceC3876ft0.t());
                    B42 b42I = up1.i(interfaceC3876ft0.S());
                    int iZ = (int) (interfaceC3876ft0.z() * 1.75f);
                    if (!interfaceC3876ft0.W()) {
                        iZ /= 2;
                    }
                    AbstractC5597nq.a aVar = this.g;
                    aVar.a(up1, interfaceC3876ft0);
                    this.c.getClass();
                    int i3 = aVar.a;
                    int i4 = (((int) ((aVar.b - i3) * 1.0f)) + 1) * 2;
                    if (b42I.d.length != i4) {
                        b42I.d = new float[i4];
                    }
                    float[] fArr = b42I.d;
                    for (int i5 = 0; i5 < i4; i5 += 2) {
                        ?? Y = interfaceC3876ft0.y((i5 / 2) + i3);
                        if (Y != 0) {
                            fArr[i5] = Y.b();
                            fArr[i5 + 1] = Y.a() * 1.0f;
                        } else {
                            fArr[i5] = 0.0f;
                            fArr[i5 + 1] = 0.0f;
                        }
                    }
                    Matrix matrix = b42I.g;
                    matrix.set(b42I.a);
                    matrix.postConcat(b42I.c.a);
                    matrix.postConcat(b42I.b);
                    matrix.mapPoints(fArr);
                    Vc2 vc2U = interfaceC3876ft0.u();
                    C3791fV0 c3791fV0U = interfaceC3876ft0.U();
                    C3791fV0 c3791fV0 = (C3791fV0) C3791fV0.h.b();
                    float f = c3791fV0U.e;
                    c3791fV0.e = f;
                    c3791fV0.g = c3791fV0U.g;
                    c3791fV0.e = AbstractC8067zc2.c(f);
                    c3791fV0.g = AbstractC8067zc2.c(c3791fV0.g);
                    int i6 = 0;
                    while (i6 < fArr.length) {
                        float f2 = fArr[i6];
                        float f3 = fArr[i6 + 1];
                        C4454ie2 c4454ie2 = (C4454ie2) this.b;
                        if (!c4454ie2.f(f2)) {
                            break;
                        }
                        if (c4454ie2.e(f2) && c4454ie2.i(f3)) {
                            int i7 = i6 / 2;
                            ?? Y2 = interfaceC3876ft0.y(aVar.a + i7);
                            if (interfaceC3876ft0.N()) {
                                vc2U.getClass();
                                int iF = interfaceC3876ft0.F(i7);
                                Paint paint2 = this.f;
                                paint2.setColor(iF);
                                canvas.drawText(vc2U.a(Y2.a()), f2, f3 - iZ, paint2);
                            }
                            if (Y2.g != null && interfaceC3876ft0.k()) {
                                int i8 = (int) (f2 + c3791fV0.e);
                                int i9 = (int) (f3 + c3791fV0.g);
                                Drawable drawable = Y2.g;
                                int intrinsicWidth = drawable.getIntrinsicWidth();
                                int intrinsicHeight = drawable.getIntrinsicHeight();
                                C3791fV0 c3791fV1 = (C3791fV0) C3791fV0.h.b();
                                c3791fV1.e = i8 - (intrinsicWidth / 2);
                                c3791fV1.g = i9 - (intrinsicHeight / 2);
                                Rect rect = AbstractC8067zc2.h;
                                drawable.copyBounds(rect);
                                int i10 = rect.left;
                                int i11 = rect.top;
                                drawable.setBounds(i10, i11, i10 + intrinsicWidth, intrinsicWidth + i11);
                                int iSave = canvas.save();
                                canvas.translate(c3791fV1.e, c3791fV1.g);
                                drawable.draw(canvas);
                                canvas.restoreToCount(iSave);
                            }
                        } else {
                            up1 = up1;
                            arrayList2 = arrayList2;
                            i2 = i2;
                        }
                        i6 += 2;
                        up1 = up1;
                        arrayList2 = arrayList2;
                        i2 = i2;
                    }
                    up0 = up1;
                    arrayList = arrayList2;
                    i = i2;
                    C3791fV0.c(c3791fV0);
                }
                i2 = i + 1;
                up1 = up0;
                arrayList2 = arrayList;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [e70] */
    /* JADX WARN: Type inference failed for: r8v2, types: [e70] */
    public final void h(Canvas canvas, InterfaceC3876ft0 interfaceC3876ft0, Path path, B42 b42, AbstractC5597nq.a aVar) {
        C0564Aa c0564AaF = interfaceC3876ft0.f();
        UP0 up0 = this.i;
        c0564AaF.getClass();
        float fM = C0564Aa.m(interfaceC3876ft0, up0);
        path.lineTo(interfaceC3876ft0.y(aVar.a + aVar.c).b(), fM);
        path.lineTo(interfaceC3876ft0.y(aVar.a).b(), fM);
        path.close();
        b42.d(path);
        Drawable drawableS = interfaceC3876ft0.s();
        if (drawableS != null) {
            g(canvas, path, drawableS);
            return;
        }
        int iD = (interfaceC3876ft0.d() << 24) | (interfaceC3876ft0.c() & 16777215);
        DisplayMetrics displayMetrics = AbstractC8067zc2.a;
        int iSave = canvas.save();
        canvas.clipPath(path);
        canvas.drawColor(iD);
        canvas.restoreToCount(iSave);
    }

    @Override // defpackage.AbstractC8032zS
    public final void f() {
    }
}
