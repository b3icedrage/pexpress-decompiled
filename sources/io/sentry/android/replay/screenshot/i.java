package io.sentry.android.replay.screenshot;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.Mesh;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import android.os.Build;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"UseKtx"})
public final class i extends Canvas {
    public Canvas a;

    @NotNull
    public final Paint b = new Paint();

    @NotNull
    public final Paint c = new Paint();

    @NotNull
    public final Rect d = new Rect();

    @NotNull
    public final Bitmap e;

    @NotNull
    public final Canvas f;

    @NotNull
    public final Rect g;

    @NotNull
    public final WeakHashMap<Bitmap, Pair<Integer, Integer>> h;

    public i() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        this.e = bitmapCreateBitmap;
        this.f = new Canvas(bitmapCreateBitmap);
        this.g = new Rect(0, 0, 1, 1);
        this.h = new WeakHashMap<>();
    }

    public static BitmapShader c(Paint paint) {
        if (paint != null) {
            Shader shader = paint.getShader();
            if (shader instanceof BitmapShader) {
                paint.setShader(null);
                return (BitmapShader) shader;
            }
        }
        return null;
    }

    public final void a(float f, float f2, Paint paint) {
        Paint paint2 = this.c;
        paint2.setColorFilter(paint.getColorFilter());
        int color = paint.getColor();
        paint2.setColor(Color.argb(100, Color.red(color), Color.green(color), Color.blue(color)));
        Rect rect = this.d;
        drawRoundRect(rect.left + f, rect.top + f2, rect.right + f, rect.bottom + f2, 10.0f, 10.0f, paint2);
    }

    @NotNull
    public final Canvas b() {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas;
        }
        Intrinsics.l("delegate");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return b().clipOutPath(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(@NotNull RectF rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return b().clipOutRect(rect);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(@NotNull Path path, @NotNull Region.Op op) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(op, "op");
        return b().clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(@NotNull RectF rect, @NotNull Region.Op op) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(op, "op");
        return b().clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public final void concat(@Nullable Matrix matrix) {
        b().concat(matrix);
    }

    public final int d(Bitmap bitmap, Paint paint, Rect rect) {
        int pixel = -16777216;
        if (bitmap.isRecycled()) {
            return -16777216;
        }
        WeakHashMap<Bitmap, Pair<Integer, Integer>> weakHashMap = this.h;
        Pair<Integer, Integer> pair = weakHashMap.get(bitmap);
        if (pair != null && pair.d.intValue() == bitmap.getGenerationId()) {
            return pair.e.intValue();
        }
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.HARDWARE;
        Canvas canvas = this.f;
        Bitmap bitmap2 = this.e;
        Rect rect2 = this.g;
        if (config == config2 && Build.VERSION.SDK_INT >= 31) {
            BitmapShader bitmapShaderC = c(paint);
            canvas.drawBitmap(bitmap.asShared(), rect, rect2, paint);
            if (bitmapShaderC != null && paint != null) {
                paint.setShader(bitmapShaderC);
            }
            pixel = bitmap2.getPixel(0, 0);
        } else if (bitmap.getConfig() != Bitmap.Config.HARDWARE) {
            BitmapShader bitmapShaderC2 = c(paint);
            canvas.drawBitmap(bitmap, rect, rect2, paint);
            if (bitmapShaderC2 != null && paint != null) {
                paint.setShader(bitmapShaderC2);
            }
            pixel = bitmap2.getPixel(0, 0);
        }
        weakHashMap.put(bitmap, new Pair<>(Integer.valueOf(bitmap.getGenerationId()), Integer.valueOf(pixel)));
        return pixel;
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        b().disableZ();
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i, int i2, int i3, int i4) {
        b().drawARGB(i, i2, i3, i4);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(@NotNull RectF oval, float f, float f2, boolean z, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(oval, "oval");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawArc(oval, f, f2, z, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(@NotNull int[] colors, int i, int i2, float f, float f2, int i3, int i4, boolean z, @Nullable Paint paint) {
        Intrinsics.checkNotNullParameter(colors, "colors");
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(@NotNull Bitmap bitmap, int i, int i2, @NotNull float[] verts, int i3, @Nullable int[] iArr, int i4, @Nullable Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(verts, "verts");
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f, float f2, float f3, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawCircle(f, f2, f3, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i) {
        b().drawColor(i);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(@NotNull RectF outer, float f, float f2, @NotNull RectF inner, float f3, float f4, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(outer, "outer");
        Intrinsics.checkNotNullParameter(inner, "inner");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawDoubleRoundRect(outer, f, f2, inner, f3, f4, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(@NotNull int[] glyphIds, int i, @NotNull float[] positions, int i2, int i3, @NotNull Font font, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(glyphIds, "glyphIds");
        Intrinsics.checkNotNullParameter(positions, "positions");
        Intrinsics.checkNotNullParameter(font, "font");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f, float f2, float f3, float f4, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawLine(f, f2, f3, f4, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(@NotNull float[] pts, int i, int i2, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(pts, "pts");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawLines(pts, i, i2, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawMesh(@NotNull Mesh mesh, @Nullable BlendMode blendMode, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(mesh, "mesh");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final void drawOval(@NotNull RectF oval, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(oval, "oval");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawOval(oval, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(@NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawPaint(paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(@NotNull NinePatch patch, @NotNull Rect dst, @Nullable Paint paint) {
        Intrinsics.checkNotNullParameter(patch, "patch");
        Intrinsics.checkNotNullParameter(dst, "dst");
        BitmapShader bitmapShaderC = c(paint);
        b().drawPatch(patch, dst, paint);
        if (paint == null) {
            return;
        }
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawPath(@NotNull Path path, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawPath(path, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(@NotNull Picture picture) {
        Intrinsics.checkNotNullParameter(picture, "picture");
        Paint paint = this.b;
        paint.setColorFilter(null);
        paint.setColor(-16777216);
        b().drawRect(0.0f, 0.0f, picture.getWidth(), picture.getHeight(), paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f, float f2, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawPoint(f, f2, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(@Nullable float[] fArr, int i, int i2, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawPoints(fArr, i, i2, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(@NotNull String text, @NotNull float[] pos, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(pos, "pos");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i, int i2, int i3) {
        b().drawRGB(i, i2, i3);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(@NotNull RectF rect, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawRect(rect, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(@NotNull RenderNode renderNode) {
        Intrinsics.checkNotNullParameter(renderNode, "renderNode");
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(@NotNull RectF rect, float f, float f2, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawRoundRect(rect, f, f2, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawText(@NotNull char[] text, int i, int i2, float f, float f2, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text, i, i2, this.d);
        a(f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(@NotNull String text, @NotNull Path path, float f, float f2, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(@NotNull char[] text, int i, int i2, int i3, int i4, float f, float f2, boolean z, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text, 0, i + i2, this.d);
        a(f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(@NotNull Canvas.VertexMode mode, int i, @NotNull float[] verts, int i2, @Nullable float[] fArr, int i3, @Nullable int[] iArr, int i4, @Nullable short[] sArr, int i5, int i6, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(verts, "verts");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        b().enableZ();
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(@NotNull Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        return b().getClipBounds(bounds);
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        return b().getDensity();
    }

    @Override // android.graphics.Canvas
    @Nullable
    public final DrawFilter getDrawFilter() {
        return b().getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        return b().getHeight();
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(@NotNull Matrix ctm) {
        Intrinsics.checkNotNullParameter(ctm, "ctm");
        b().getMatrix(ctm);
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        return b().getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        return b().getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        return b().getSaveCount();
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        return b().getWidth();
    }

    @Override // android.graphics.Canvas
    public final boolean isHardwareAccelerated() {
        return false;
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        return b().isOpaque();
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(@NotNull RectF rect, @NotNull Canvas.EdgeType type) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(type, "type");
        return b().quickReject(rect, type);
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        b().restore();
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i) {
        b().restoreToCount(i);
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f) {
        b().rotate(f);
    }

    @Override // android.graphics.Canvas
    public final int save() {
        return b().save();
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(@Nullable RectF rectF, @Nullable Paint paint, int i) {
        BitmapShader bitmapShaderC = c(paint);
        int iSaveLayer = b().saveLayer(rectF, paint, i);
        if (paint == null) {
            return iSaveLayer;
        }
        paint.setShader(bitmapShaderC);
        return iSaveLayer;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(@Nullable RectF rectF, int i, int i2) {
        return b().saveLayerAlpha(rectF, i, i2);
    }

    @Override // android.graphics.Canvas
    public final void scale(float f, float f2) {
        b().scale(f, f2);
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(@Nullable Bitmap bitmap) {
        b().setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i) {
        b().setDensity(i);
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(@Nullable DrawFilter drawFilter) {
        b().setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(@Nullable Matrix matrix) {
        b().setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final void skew(float f, float f2) {
        b().skew(f, f2);
    }

    @Override // android.graphics.Canvas
    public final void translate(float f, float f2) {
        b().translate(f, f2);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return b().clipOutRect(rect);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return b().clipPath(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(@NotNull Rect rect, @NotNull Region.Op op) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(op, "op");
        return b().clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(@NotNull int[] colors, int i, int i2, int i3, int i4, int i5, int i6, boolean z, @Nullable Paint paint) {
        Intrinsics.checkNotNullParameter(colors, "colors");
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j) {
        b().drawColor(j);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(@NotNull char[] text, int i, int i2, @NotNull float[] pos, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(pos, "pos");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(@NotNull char[] text, int i, int i2, @NotNull Path path, float f, float f2, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(@NotNull RectF rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return b().quickReject(rect);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(@Nullable RectF rectF, int i) {
        return b().saveLayerAlpha(rectF, i);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f, float f2, float f3, float f4) {
        return b().clipOutRect(f, f2, f3, f4);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(@NotNull RectF rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return b().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(@NotNull Bitmap bitmap, float f, float f2, @Nullable Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        int iD = d(bitmap, paint, null);
        Paint paint2 = this.b;
        paint2.setColor(iD);
        paint2.setColorFilter(null);
        b().drawRect(f, f2, f + bitmap.getWidth(), f2 + bitmap.getHeight(), paint2);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, @NotNull PorterDuff.Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        b().drawColor(i, mode);
    }

    @Override // android.graphics.Canvas
    public final void drawText(@NotNull String text, float f, float f2, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text, 0, text.length(), this.d);
        a(f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(@NotNull CharSequence text, int i, int i2, int i3, int i4, float f, float f2, boolean z, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text.toString(), i, i2, this.d);
        a(f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(@NotNull Path path, @NotNull Canvas.EdgeType type) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(type, "type");
        return b().quickReject(path, type);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i, int i2) {
        return b().saveLayerAlpha(f, f2, f3, f4, i, i2);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i, int i2, int i3, int i4) {
        return b().clipOutRect(i, i2, i3, i4);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return b().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawArc(f, f2, f3, f4, f5, f6, z, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, @NotNull BlendMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        b().drawColor(i, mode);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(@NotNull RectF outer, @NotNull float[] outerRadii, @NotNull RectF inner, @NotNull float[] innerRadii, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(outer, "outer");
        Intrinsics.checkNotNullParameter(outerRadii, "outerRadii");
        Intrinsics.checkNotNullParameter(inner, "inner");
        Intrinsics.checkNotNullParameter(innerRadii, "innerRadii");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawDoubleRoundRect(outer, outerRadii, inner, innerRadii, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(@NotNull float[] pts, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(pts, "pts");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawLines(pts, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f, float f2, float f3, float f4, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawOval(f, f2, f3, f4, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(@NotNull NinePatch patch, @NotNull RectF dst, @Nullable Paint paint) {
        Intrinsics.checkNotNullParameter(patch, "patch");
        Intrinsics.checkNotNullParameter(dst, "dst");
        BitmapShader bitmapShaderC = c(paint);
        b().drawPatch(patch, dst, paint);
        if (paint == null) {
            return;
        }
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(@NotNull Picture picture, @NotNull RectF dst) {
        Intrinsics.checkNotNullParameter(picture, "picture");
        Intrinsics.checkNotNullParameter(dst, "dst");
        Paint paint = this.b;
        paint.setColorFilter(null);
        paint.setColor(-16777216);
        b().drawRect(dst, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(@NotNull float[] pts, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(pts, "pts");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawPoints(pts, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(@NotNull Rect r, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(r, "r");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawRect(r, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawRoundRect(f, f2, f3, f4, f5, f6, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return b().quickReject(path);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(@Nullable RectF rectF, @Nullable Paint paint) {
        BitmapShader bitmapShaderC = c(paint);
        int iSaveLayer = b().saveLayer(rectF, paint);
        if (paint == null) {
            return iSaveLayer;
        }
        paint.setShader(bitmapShaderC);
        return iSaveLayer;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i) {
        return b().saveLayerAlpha(f, f2, f3, f4, i);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f, float f2, float f3, float f4, @NotNull Region.Op op) {
        Intrinsics.checkNotNullParameter(op, "op");
        return b().clipRect(f, f2, f3, f4, op);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j, @NotNull BlendMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        b().drawColor(j, mode);
    }

    @Override // android.graphics.Canvas
    public final void drawText(@NotNull String text, int i, int i2, float f, float f2, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text, i, i2, this.d);
        a(f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(@NotNull MeasuredText text, int i, int i2, int i3, int i4, float f, float f2, boolean z, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text.toString(), i, i2, this.d);
        a(f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f, float f2, float f3, float f4, @NotNull Canvas.EdgeType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return b().quickReject(f, f2, f3, f4, type);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f, float f2, float f3, float f4) {
        return b().clipRect(f, f2, f3, f4);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f, float f2, float f3, float f4) {
        return b().quickReject(f, f2, f3, f4);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i, int i2, int i3, int i4) {
        return b().clipRect(i, i2, i3, i4);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(@NotNull Bitmap bitmap, @Nullable Rect rect, @NotNull RectF dst, @Nullable Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(dst, "dst");
        int iD = d(bitmap, paint, rect);
        Paint paint2 = this.b;
        paint2.setColor(iD);
        paint2.setColorFilter(null);
        b().drawRect(dst, paint2);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(@NotNull Picture picture, @NotNull Rect dst) {
        Intrinsics.checkNotNullParameter(picture, "picture");
        Intrinsics.checkNotNullParameter(dst, "dst");
        Paint paint = this.b;
        paint.setColorFilter(null);
        paint.setColor(-16777216);
        b().drawRect(dst, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f, float f2, float f3, float f4, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawRect(f, f2, f3, f4, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawText(@NotNull CharSequence text, int i, int i2, float f, float f2, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.getTextBounds(text.toString(), 0, text.length(), this.d);
        a(f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f, float f2, float f3, float f4, @Nullable Paint paint, int i) {
        BitmapShader bitmapShaderC = c(paint);
        int iSaveLayer = b().saveLayer(f, f2, f3, f4, paint, i);
        if (paint == null) {
            return iSaveLayer;
        }
        paint.setShader(bitmapShaderC);
        return iSaveLayer;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f, float f2, float f3, float f4, @Nullable Paint paint) {
        BitmapShader bitmapShaderC = c(paint);
        int iSaveLayer = b().saveLayer(f, f2, f3, f4, paint);
        if (paint == null) {
            return iSaveLayer;
        }
        paint.setShader(bitmapShaderC);
        return iSaveLayer;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(@NotNull Bitmap bitmap, @Nullable Rect rect, @NotNull Rect dst, @Nullable Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(dst, "dst");
        int iD = d(bitmap, paint, rect);
        Paint paint2 = this.b;
        paint2.setColor(iD);
        paint2.setColorFilter(null);
        b().drawRect(dst, paint2);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(@NotNull Bitmap bitmap, @NotNull Matrix matrix, @Nullable Paint paint) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        int iD = d(bitmap, paint, null);
        Paint paint2 = this.b;
        paint2.setColor(iD);
        paint2.setColorFilter(null);
        int iSave = b().save();
        b().setMatrix(matrix);
        b().drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), paint2);
        b().restoreToCount(iSave);
    }
}
