package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0002:;J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u0006R\"\u0010%\u001a\u00020\u001e8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010)\u001a\u00020\u001e8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R\"\u0010-\u001a\u00020\u001e8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\"\"\u0004\b,\u0010$R$\u00105\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0014\u00109\u001a\u0002068&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006<"}, d2 = {"Lyq;", "Landroid/widget/FrameLayout;", "", "color", "", "setPointsColor", "(I)V", "Lae2;", "viewPager", "setViewPager", "(Lae2;)V", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager2", "setViewPager2", "(Landroidx/viewpager2/widget/ViewPager2;)V", "", "e", "Z", "getDotsClickable", "()Z", "setDotsClickable", "(Z)V", "dotsClickable", AppMeasurementSdk.ConditionalUserProperty.VALUE, "g", "I", "getDotsColor", "()I", "setDotsColor", "dotsColor", "", "h", "F", "getDotsSize", "()F", "setDotsSize", "(F)V", "dotsSize", "i", "getDotsCornerRadius", "setDotsCornerRadius", "dotsCornerRadius", "j", "getDotsSpacing", "setDotsSpacing", "dotsSpacing", "Lyq$a;", "k", "Lyq$a;", "getPager", "()Lyq$a;", "setPager", "(Lyq$a;)V", "pager", "Lyq$b;", "getType", "()Lyq$b;", "type", R51.PUSH_ADDITIONAL_DATA_KEY, "b", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 4, 2})
public abstract class AbstractC7907yq extends FrameLayout {

    @NotNull
    public final ArrayList<ImageView> d;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean dotsClickable;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int dotsColor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public float dotsSize;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public float dotsCornerRadius;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public float dotsSpacing;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public a pager;

    /* JADX INFO: renamed from: yq$a */
    public interface a {
        void a(@NotNull T20 t20);

        int b();

        void c(int i);

        void d();

        boolean e();

        int getCount();
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'k' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: yq$b */
    public static final class b {
        public static final b k;
        public static final /* synthetic */ b[] l;
        public final float d;

        @NotNull
        public final int[] e;
        public final int g;
        public final int h;
        public final int i;
        public final int j;

        static {
            int[] iArr = C2239Vl1.b;
            Intrinsics.checkNotNullExpressionValue(iArr, "R.styleable.SpringDotsIndicator");
            b bVar = new b("DEFAULT", 0, 8.0f, iArr, 2, 4, 5, 3);
            k = bVar;
            int[] iArr2 = C2239Vl1.a;
            Intrinsics.checkNotNullExpressionValue(iArr2, "R.styleable.DotsIndicator");
            b bVar2 = new b("SPRING", 1, 4.0f, iArr2, 1, 4, 5, 2);
            int[] iArr3 = C2239Vl1.c;
            Intrinsics.checkNotNullExpressionValue(iArr3, "R.styleable.WormDotsIndicator");
            l = new b[]{bVar, bVar2, new b("WORM", 2, 4.0f, iArr3, 1, 3, 4, 2)};
        }

        public b(String str, int i, float f, int[] iArr, int i2, int i3, int i4, int i5) {
            super(str, i);
            this.d = f;
            this.e = iArr;
            this.g = i2;
            this.h = i3;
            this.i = i4;
            this.j = i5;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) l.clone();
        }
    }

    /* JADX INFO: renamed from: yq$c */
    public static final class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractC7907yq abstractC7907yq = AbstractC7907yq.this;
            ArrayList<ImageView> arrayList = abstractC7907yq.d;
            int size = arrayList.size();
            a aVar = abstractC7907yq.pager;
            Intrinsics.checkNotNull(aVar);
            if (size < aVar.getCount()) {
                a aVar2 = abstractC7907yq.pager;
                Intrinsics.checkNotNull(aVar2);
                int count = aVar2.getCount() - arrayList.size();
                for (int i = 0; i < count; i++) {
                    abstractC7907yq.a(i);
                }
            } else {
                int size2 = arrayList.size();
                a aVar3 = abstractC7907yq.pager;
                Intrinsics.checkNotNull(aVar3);
                if (size2 > aVar3.getCount()) {
                    int size3 = arrayList.size();
                    a aVar4 = abstractC7907yq.pager;
                    Intrinsics.checkNotNull(aVar4);
                    int count2 = size3 - aVar4.getCount();
                    for (int i2 = 0; i2 < count2; i2++) {
                        abstractC7907yq.f();
                    }
                }
            }
            abstractC7907yq.e();
            a aVar5 = abstractC7907yq.pager;
            Intrinsics.checkNotNull(aVar5);
            int iB = aVar5.b();
            for (int i3 = 0; i3 < iB; i3++) {
                ImageView imageView = abstractC7907yq.d.get(i3);
                Intrinsics.checkNotNullExpressionValue(imageView, "dots[i]");
                AbstractC7907yq.g(imageView, (int) abstractC7907yq.dotsSize);
            }
            a aVar6 = abstractC7907yq.pager;
            Intrinsics.checkNotNull(aVar6);
            if (aVar6.e()) {
                a aVar7 = abstractC7907yq.pager;
                Intrinsics.checkNotNull(aVar7);
                aVar7.d();
                T20 t20B = abstractC7907yq.b();
                a aVar8 = abstractC7907yq.pager;
                Intrinsics.checkNotNull(aVar8);
                aVar8.a(t20B);
                a aVar9 = abstractC7907yq.pager;
                Intrinsics.checkNotNull(aVar9);
                t20B.a(aVar9.b(), 0.0f);
            }
        }
    }

    /* JADX INFO: renamed from: yq$d */
    public static final class d extends RecyclerView.g {
        public d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void a() {
            AbstractC7907yq.this.d();
        }
    }

    /* JADX INFO: renamed from: yq$e */
    public static final class e implements a {

        @Nullable
        public a a;
        public final /* synthetic */ ViewPager2 b;

        /* JADX INFO: renamed from: yq$e$a */
        public static final class a extends ViewPager2.e {
            public final /* synthetic */ T20 a;

            public a(T20 t20) {
                this.a = t20;
            }

            @Override // androidx.viewpager2.widget.ViewPager2.e
            public final void b(float f, int i, int i2) {
                this.a.a(i, f);
            }
        }

        public e(AbstractC7907yq abstractC7907yq, ViewPager2 viewPager2) {
            this.b = viewPager2;
        }

        @Override // defpackage.AbstractC7907yq.a
        public final void a(@NotNull T20 onPageChangeListenerHelper) {
            Intrinsics.checkNotNullParameter(onPageChangeListenerHelper, "onPageChangeListenerHelper");
            a aVar = new a(onPageChangeListenerHelper);
            this.a = aVar;
            Intrinsics.checkNotNull(aVar);
            this.b.a(aVar);
        }

        @Override // defpackage.AbstractC7907yq.a
        public final int b() {
            return this.b.getCurrentItem();
        }

        @Override // defpackage.AbstractC7907yq.a
        public final void c(int i) {
            this.b.c(i, true);
        }

        @Override // defpackage.AbstractC7907yq.a
        public final void d() {
            a aVar = this.a;
            if (aVar != null) {
                this.b.g.a.remove(aVar);
            }
        }

        @Override // defpackage.AbstractC7907yq.a
        public final boolean e() {
            ViewPager2 isNotEmpty = this.b;
            Intrinsics.checkNotNullParameter(isNotEmpty, "$this$isNotEmpty");
            RecyclerView.e adapter = isNotEmpty.getAdapter();
            Intrinsics.checkNotNull(adapter);
            Intrinsics.checkNotNullExpressionValue(adapter, "adapter!!");
            return adapter.c() > 0;
        }

        @Override // defpackage.AbstractC7907yq.a
        public final int getCount() {
            RecyclerView.e adapter = this.b.getAdapter();
            if (adapter != null) {
                return adapter.c();
            }
            return 0;
        }
    }

    public AbstractC7907yq(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void g(@NotNull View setWidth, int i) {
        Intrinsics.checkNotNullParameter(setWidth, "$this$setWidth");
        setWidth.getLayoutParams().width = i;
        setWidth.requestLayout();
    }

    public abstract void a(int i);

    @NotNull
    public abstract T20 b();

    public abstract void c(int i);

    public final void d() {
        if (this.pager == null) {
            return;
        }
        post(new c());
    }

    public final void e() {
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            c(i);
        }
    }

    public abstract void f();

    public final boolean getDotsClickable() {
        return this.dotsClickable;
    }

    public final int getDotsColor() {
        return this.dotsColor;
    }

    public final float getDotsCornerRadius() {
        return this.dotsCornerRadius;
    }

    public final float getDotsSize() {
        return this.dotsSize;
    }

    public final float getDotsSpacing() {
        return this.dotsSpacing;
    }

    @Nullable
    public final a getPager() {
        return this.pager;
    }

    @NotNull
    public abstract b getType();

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getLayoutDirection() == 1) {
            setLayoutDirection(0);
            setRotation(180.0f);
            requestLayout();
        }
    }

    public final void setDotsClickable(boolean z) {
        this.dotsClickable = z;
    }

    public final void setDotsColor(int i) {
        this.dotsColor = i;
        e();
    }

    public final void setDotsCornerRadius(float f) {
        this.dotsCornerRadius = f;
    }

    public final void setDotsSize(float f) {
        this.dotsSize = f;
    }

    public final void setDotsSpacing(float f) {
        this.dotsSpacing = f;
    }

    public final void setPager(@Nullable a aVar) {
        this.pager = aVar;
    }

    public final void setPointsColor(int color) {
        setDotsColor(color);
        e();
    }

    public final void setViewPager(@NotNull C2762ae2 viewPager) {
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        viewPager.getAdapter();
        throw new IllegalStateException("You have to set an adapter to the view pager before initializing the dots indicator !");
    }

    public final void setViewPager2(@NotNull ViewPager2 viewPager2) {
        Intrinsics.checkNotNullParameter(viewPager2, "viewPager2");
        if (viewPager2.getAdapter() == null) {
            throw new IllegalStateException("You have to set an adapter to the view pager before initializing the dots indicator !");
        }
        RecyclerView.e adapter = viewPager2.getAdapter();
        Intrinsics.checkNotNull(adapter);
        adapter.n(new d());
        this.pager = new e(this, viewPager2);
        d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7907yq(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.d = new ArrayList<>();
        this.dotsClickable = true;
        this.dotsColor = -16711681;
        getType().getClass();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        Resources resources = context2.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        float f = resources.getDisplayMetrics().density * 16.0f;
        this.dotsSize = f;
        this.dotsCornerRadius = f / 2.0f;
        float f2 = getType().d;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        Resources resources2 = context3.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "context.resources");
        this.dotsSpacing = resources2.getDisplayMetrics().density * f2;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, getType().e);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…(attrs, type.styleableId)");
            setDotsColor(typedArrayObtainStyledAttributes.getColor(getType().g, -16711681));
            this.dotsSize = typedArrayObtainStyledAttributes.getDimension(getType().h, this.dotsSize);
            this.dotsCornerRadius = typedArrayObtainStyledAttributes.getDimension(getType().j, this.dotsCornerRadius);
            this.dotsSpacing = typedArrayObtainStyledAttributes.getDimension(getType().i, this.dotsSpacing);
            getType().getClass();
            this.dotsClickable = typedArrayObtainStyledAttributes.getBoolean(1, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
