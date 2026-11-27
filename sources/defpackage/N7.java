package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.MimeTypeMap;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import coil.target.ImageViewTarget;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.pexpress.tool.R;
import io.jsonwebtoken.JwtParser;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class N7 implements InterfaceC2780aj0 {

    @NotNull
    public static final N7 d = new N7();

    @NotNull
    public static final GW1 e = new GW1("REMOVED_TASK");

    @NotNull
    public static final GW1 g = new GW1("CLOSED_EMPTY");

    public static final class a implements InterfaceC5739oX1 {
        public final /* synthetic */ C3027bp1 d;
        public final /* synthetic */ C3027bp1 e;
        public final /* synthetic */ Context g;
        public final /* synthetic */ C3027bp1 h;

        public a(C3027bp1 c3027bp1, C3027bp1 c3027bp2, Context context, C3027bp1 c3027bp3) {
            this.d = c3027bp1;
            this.e = c3027bp2;
            this.g = context;
            this.h = c3027bp3;
        }

        @Override // defpackage.InterfaceC5739oX1
        public final void a(@NotNull Drawable result) {
            Intrinsics.checkNotNullParameter(result, "result");
            C3027bp1 c3027bp1 = this.h;
            AppCompatImageView appCompatImageView = ((C0787Cw0) c3027bp1.d).e;
            if (appCompatImageView != null) {
                appCompatImageView.setVisibility(8);
            }
            ProgressBar progressBar = ((C0787Cw0) c3027bp1.d).b;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            ((C0787Cw0) c3027bp1.d).a.setImageDrawable(result);
        }

        @Override // defpackage.InterfaceC5739oX1
        public final void c(@Nullable Drawable drawable) {
            C3027bp1 c3027bp1 = this.e;
            ProgressBar progressBar = ((C0787Cw0) c3027bp1.d).b;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            TextView textView = ((C0787Cw0) c3027bp1.d).d;
            if (textView != null) {
                textView.setText(this.g.getString(R.string.media_uploading_common_error));
            }
            TextView textView2 = ((C0787Cw0) c3027bp1.d).d;
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(0);
        }

        @Override // defpackage.InterfaceC5739oX1
        public final void d(@Nullable Drawable drawable) {
            C3027bp1 c3027bp1 = this.d;
            ProgressBar progressBar = ((C0787Cw0) c3027bp1.d).b;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
            AppCompatImageView appCompatImageView = ((C0787Cw0) c3027bp1.d).e;
            if (appCompatImageView != null) {
                appCompatImageView.setVisibility(0);
            }
            TextView textView = ((C0787Cw0) c3027bp1.d).d;
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    @Nullable
    public static final Class A(@Nullable InterfaceC4675jU interfaceC4675jU) {
        if (!(interfaceC4675jU instanceof FC) || !C7138vA0.b(interfaceC4675jU)) {
            return null;
        }
        FC fc = (FC) interfaceC4675jU;
        Class<?> clsK = C7437wc2.k(fc);
        if (clsK != null) {
            return clsK;
        }
        throw new C3761fL0("Class object for the class " + fc.getName() + " cannot be found (classId=" + C4900kZ.f((InterfaceC5044lD) interfaceC4675jU) + ')');
    }

    public static final Class B(AbstractC4649jL0 abstractC4649jL0) {
        AbstractC5706oM1 abstractC5706oM1I;
        Class clsA = A(abstractC4649jL0.V0().c());
        if (clsA == null) {
            return null;
        }
        if (C3089c72.e(abstractC4649jL0) && ((abstractC5706oM1I = C7138vA0.i(abstractC4649jL0)) == null || C3089c72.e(abstractC5706oM1I) || RK0.G(abstractC5706oM1I))) {
            return null;
        }
        return clsA;
    }

    @NotNull
    public static final String C(long j, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (j / ((long) 60)) + " " + context.getString(R.string.min_text);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [Cw0, T] */
    /* JADX WARN: Type inference failed for: r2v4, types: [Cw0, T, java.lang.Object] */
    public static final void a(@NotNull ViewGroup layout, @Nullable AbstractC4688jY0 abstractC4688jY0) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        if (abstractC4688jY0 == null) {
            return;
        }
        Context context = layout.getContext();
        C3027bp1 c3027bp1 = new C3027bp1();
        ?? r2 = (C0787Cw0) layout.getTag();
        c3027bp1.d = r2;
        if (r2 == 0) {
            ?? c0787Cw0 = new C0787Cw0(layout);
            c3027bp1.d = c0787Cw0;
            layout.setTag(c0787Cw0);
        }
        ((C0787Cw0) c3027bp1.d).a.setImageDrawable(null);
        if (abstractC4688jY0.equals(AbstractC4688jY0.c.a)) {
            AppCompatImageView appCompatImageView = ((C0787Cw0) c3027bp1.d).e;
            if (appCompatImageView == null) {
                return;
            }
            appCompatImageView.setVisibility(0);
            return;
        }
        if (abstractC4688jY0.equals(AbstractC4688jY0.d.a)) {
            ProgressBar progressBar = ((C0787Cw0) c3027bp1.d).b;
            if (progressBar == null) {
                return;
            }
            progressBar.setVisibility(0);
            return;
        }
        if (abstractC4688jY0 instanceof AbstractC4688jY0.e) {
            Context context2 = ((C0787Cw0) c3027bp1.d).a.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "viewHolder.imageView.context");
            InterfaceC6246qw0 interfaceC6246qw0I = LE.i(context2);
            Context context3 = ((C0787Cw0) c3027bp1.d).a.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "viewHolder.imageView.context");
            C7716xw0.a aVar = new C7716xw0.a(context3);
            int iF = C7279vr.f(220);
            C4220hY0 c4220hY0 = ((AbstractC4688jY0.e) abstractC4688jY0).a;
            boolean z = c4220hY0.d;
            String str = c4220hY0.b;
            if (z) {
                str = str + "?width=" + iF + "&thumb";
            }
            aVar.c = str;
            aVar.d = new a(c3027bp1, c3027bp1, context, c3027bp1);
            aVar.m = null;
            aVar.n = null;
            aVar.o = null;
            interfaceC6246qw0I.a(aVar.a());
            return;
        }
        if (abstractC4688jY0.equals(AbstractC4688jY0.b.a)) {
            AppCompatImageView appCompatImageView2 = ((C0787Cw0) c3027bp1.d).e;
            if (appCompatImageView2 != null) {
                appCompatImageView2.setVisibility(0);
            }
            ProgressBar progressBar2 = ((C0787Cw0) c3027bp1.d).b;
            if (progressBar2 != null) {
                progressBar2.setVisibility(8);
            }
            TextView textView = ((C0787Cw0) c3027bp1.d).d;
            if (textView == null) {
                return;
            }
            textView.setVisibility(0);
            return;
        }
        if (abstractC4688jY0 instanceof AbstractC4688jY0.a) {
            ProgressBar progressBar3 = ((C0787Cw0) c3027bp1.d).b;
            if (progressBar3 != null) {
                progressBar3.setVisibility(8);
            }
            TextView textView2 = ((C0787Cw0) c3027bp1.d).d;
            if (textView2 != null) {
                textView2.setText(context.getString(R.string.media_uploading_common_error));
            }
            TextView textView3 = ((C0787Cw0) c3027bp1.d).d;
            if (textView3 == null) {
                return;
            }
            textView3.setVisibility(0);
        }
    }

    @Nullable
    public static final Object b(@Nullable Object obj, @NotNull InterfaceC1490Lx descriptor) {
        AbstractC4649jL0 abstractC4649jL0L;
        Class clsB;
        Method methodN;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return (((descriptor instanceof InterfaceC0671Bj1) && C7138vA0.e((InterfaceC2982bd2) descriptor)) || (abstractC4649jL0L = l(descriptor)) == null || (clsB = B(abstractC4649jL0L)) == null || (methodN = n(clsB, descriptor)) == null) ? obj : methodN.invoke(obj, new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    /* JADX WARN: Code duplicated, block: B:40:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:? A[LOOP:0: B:21:0x0058->B:41:?, LOOP_END, SYNTHETIC] */
    @NotNull
    public static final InterfaceC2355Wx c(@NotNull InterfaceC2355Wx interfaceC2355Wx, @NotNull InterfaceC2076Tj0 descriptor, boolean z) {
        List<Xc2> listJ;
        Iterator<T> it;
        AbstractC4649jL0 type;
        AbstractC4649jL0 abstractC4649jL0N;
        AbstractC4649jL0 abstractC4649jL0L;
        Intrinsics.checkNotNullParameter(interfaceC2355Wx, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!C7138vA0.a(descriptor)) {
            List<InterfaceC1076Go1> listW0 = descriptor.w0();
            Intrinsics.checkNotNullExpressionValue(listW0, "getContextReceiverParameters(...)");
            if (listW0 != null && listW0.isEmpty()) {
                listJ = descriptor.j();
                Intrinsics.checkNotNullExpressionValue(listJ, "getValueParameters(...)");
                if (listJ == null) {
                    it = listJ.iterator();
                    while (it.hasNext()) {
                        type = ((Xc2) it.next()).getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        if (C7138vA0.g(type)) {
                        }
                    }
                    abstractC4649jL0N = descriptor.n();
                    if (abstractC4649jL0N != null) {
                    }
                }
                it = listJ.iterator();
                while (it.hasNext()) {
                    type = ((Xc2) it.next()).getType();
                    Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    if (C7138vA0.g(type)) {
                    }
                }
                abstractC4649jL0N = descriptor.n();
                if (abstractC4649jL0N != null) {
                }
            }
            Iterator<T> it2 = listW0.iterator();
            while (it2.hasNext()) {
                AbstractC4649jL0 type2 = ((InterfaceC1076Go1) it2.next()).getType();
                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                if (C7138vA0.g(type2)) {
                }
            }
            listJ = descriptor.j();
            Intrinsics.checkNotNullExpressionValue(listJ, "getValueParameters(...)");
            if (listJ == null && listJ.isEmpty()) {
                abstractC4649jL0N = descriptor.n();
                return abstractC4649jL0N != null ? interfaceC2355Wx : interfaceC2355Wx;
            }
            it = listJ.iterator();
            while (it.hasNext()) {
                type = ((Xc2) it.next()).getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                if (C7138vA0.g(type)) {
                }
            }
            abstractC4649jL0N = descriptor.n();
            if ((abstractC4649jL0N != null || !C7138vA0.c(abstractC4649jL0N)) && ((abstractC4649jL0L = l(descriptor)) == null || !C7138vA0.g(abstractC4649jL0L))) {
            }
        }
        return new Qc2(interfaceC2355Wx, descriptor, z);
    }

    @NotNull
    public static BigDecimal d(@NotNull Double d2) {
        return BigDecimal.valueOf(d2.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:13:0x0034 A[RETURN] */
    @Nullable
    public static final C4963kp1 e(@NotNull Annotation[] annotationArr, @NotNull C1758Ph0 fqName) {
        Intrinsics.checkNotNullParameter(annotationArr, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        for (Annotation annotation : annotationArr) {
            if (Intrinsics.a(C4753jp1.a(C7279vr.g(C7279vr.e(annotation))).a(), fqName)) {
                if (annotation != null) {
                    return new C4963kp1(annotation);
                }
                return null;
            }
        }
        annotation = null;
        if (annotation != null) {
            return new C4963kp1(annotation);
        }
        return null;
    }

    @NotNull
    public static final ArrayList f(@NotNull Annotation[] annotationArr) {
        Intrinsics.checkNotNullParameter(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new C4963kp1(annotation));
        }
        return arrayList;
    }

    public static final int g(@NotNull InterfaceC2355Wx interfaceC2355Wx) {
        Intrinsics.checkNotNullParameter(interfaceC2355Wx, "<this>");
        return interfaceC2355Wx.b().size();
    }

    @NotNull
    public static Date h() {
        return Calendar.getInstance(io.sentry.vendor.gson.internal.bind.util.a.a).getTime();
    }

    @NotNull
    public static Date i(long j) {
        Calendar calendar = Calendar.getInstance(io.sentry.vendor.gson.internal.bind.util.a.a);
        calendar.setTimeInMillis(j);
        return calendar.getTime();
    }

    @NotNull
    public static Date j(@NotNull String str) {
        try {
            return io.sentry.vendor.gson.internal.bind.util.a.c(str, new ParsePosition(0));
        } catch (ParseException unused) {
            throw new IllegalArgumentException(C5491nL.c("timestamp is not ISO format ", str));
        }
    }

    @NotNull
    public static Date k(@NotNull String str) {
        try {
            return i(new BigDecimal(str).setScale(3, RoundingMode.DOWN).movePointRight(3).longValue());
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(C5491nL.c("timestamp is not millis format ", str));
        }
    }

    public static final AbstractC4649jL0 l(InterfaceC1490Lx interfaceC1490Lx) {
        InterfaceC1076Go1 interfaceC1076Go1R0 = interfaceC1490Lx.r0();
        InterfaceC1076Go1 interfaceC1076Go1M0 = interfaceC1490Lx.m0();
        if (interfaceC1076Go1R0 != null) {
            return interfaceC1076Go1R0.getType();
        }
        if (interfaceC1076Go1M0 != null) {
            if (interfaceC1490Lx instanceof InterfaceC3550eL) {
                return interfaceC1076Go1M0.getType();
            }
            InterfaceC4675jU interfaceC4675jUE = interfaceC1490Lx.e();
            FC fc = interfaceC4675jUE instanceof FC ? (FC) interfaceC4675jUE : null;
            if (fc != null) {
                return fc.y();
            }
        }
        return null;
    }

    public static final String m(long j, Context context) {
        String string;
        if (0 > j || j >= 1000) {
            string = (1000 > j || j >= 1000000) ? context.getString(R.string.format_file_size_mb, Double.valueOf(j / Math.pow(10.0d, 6))) : context.getString(R.string.format_file_size_kb, Double.valueOf(j / 1000.0d));
        } else {
            string = context.getString(R.string.format_file_size_b, Double.valueOf(j));
        }
        Intrinsics.checkNotNullExpressionValue(string, "when (size) {\n    in 0..… size.div(10.0.pow(6)))\n}");
        return string;
    }

    @NotNull
    public static final Method n(@NotNull Class cls, @NotNull InterfaceC1490Lx descriptor) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        try {
            return cls.getDeclaredMethod("unbox-impl", new Class[0]);
        } catch (NoSuchMethodException unused) {
            throw new C3761fL0("No unbox method found in inline class: " + cls + " (calling " + descriptor + ')');
        }
    }

    @Nullable
    public static final ArrayList o(@NotNull AbstractC5706oM1 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        ArrayList arrayListP = p(V62.a(type));
        if (arrayListP == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(XE.m(arrayListP, 10));
        Iterator it = arrayListP.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it.next()));
        }
        InterfaceC5044lD interfaceC5044lDC = type.V0().c();
        Intrinsics.c(interfaceC5044lDC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Class<?> clsK = C7437wc2.k((FC) interfaceC5044lDC);
        Intrinsics.checkNotNull(clsK);
        ArrayList arrayList2 = new ArrayList(XE.m(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(clsK.getDeclaredMethod((String) it2.next(), new Class[0]));
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public static final ArrayList p(AbstractC5706oM1 abstractC5706oM1) {
        ?? C;
        if (!C7138vA0.h(abstractC5706oM1)) {
            return null;
        }
        InterfaceC5044lD interfaceC5044lDC = abstractC5706oM1.V0().c();
        Intrinsics.c(interfaceC5044lDC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        int i = C4900kZ.a;
        Rc2<AbstractC5706oM1> rc2F0 = ((FC) interfaceC5044lDC).F0();
        H11 h11 = rc2F0 instanceof H11 ? (H11) rc2F0 : null;
        Intrinsics.checkNotNull(h11);
        ArrayList<Pair> arrayList = h11.a;
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            C5638o21 c5638o21 = (C5638o21) pair.d;
            ArrayList arrayListP = p((AbstractC5706oM1) pair.e);
            if (arrayListP != null) {
                C = new ArrayList(XE.m(arrayListP, 10));
                Iterator it = arrayListP.iterator();
                while (it.hasNext()) {
                    C.add(c5638o21.f() + '-' + ((String) it.next()));
                }
            } else {
                C = VE.c(c5638o21.f());
            }
            C2904bF.o(arrayList2, C);
        }
        return arrayList2;
    }

    @NotNull
    public static String q(@NotNull Date date) {
        TimeZone timeZone = io.sentry.vendor.gson.internal.bind.util.a.a;
        Locale locale = Locale.US;
        TimeZone timeZone2 = io.sentry.vendor.gson.internal.bind.util.a.a;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone2, locale);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(23 + (timeZone2.getRawOffset() == 0 ? 1 : 6));
        io.sentry.vendor.gson.internal.bind.util.a.b(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        io.sentry.vendor.gson.internal.bind.util.a.b(sb, gregorianCalendar.get(13), 2);
        sb.append(JwtParser.SEPARATOR_CHAR);
        io.sentry.vendor.gson.internal.bind.util.a.b(sb, gregorianCalendar.get(14), 3);
        int offset = timeZone2.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / 60000;
            int iAbs = Math.abs(i / 60);
            int iAbs2 = Math.abs(i % 60);
            sb.append(offset >= 0 ? '+' : '-');
            io.sentry.vendor.gson.internal.bind.util.a.b(sb, iAbs, 2);
            sb.append(':');
            io.sentry.vendor.gson.internal.bind.util.a.b(sb, iAbs2, 2);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }

    public static final void r(@NotNull AppCompatImageView imageView, @Nullable C7129v8 c7129v8) {
        long j;
        Intrinsics.checkNotNullParameter(imageView, "view");
        if (c7129v8 == null) {
            imageView.setImageResource(2131231354);
            return;
        }
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        InterfaceC6246qw0 interfaceC6246qw0I = LE.i(context);
        Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C7716xw0.a aVar = new C7716xw0.a(context2);
        aVar.c = c7129v8.e;
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        aVar.d = new ImageViewTarget(imageView);
        aVar.m = null;
        aVar.n = null;
        aVar.o = null;
        aVar.k = 2131231354;
        Intrinsics.checkNotNullParameter(c7129v8, "<this>");
        byte[] bArr = C6806tc2.a;
        String str = c7129v8.a;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            j = Long.parseLong(str);
        } catch (NumberFormatException unused) {
            j = 0;
        }
        aVar.l = Integer.valueOf(j < 0 ? 2131231346 : 2131231354);
        aVar.c(new C4363iC());
        interfaceC6246qw0I.a(aVar.a());
    }

    public static void s(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof Aj2) {
                editorInfo.hintText = ((Aj2) parent).a();
                return;
            }
        }
    }

    @NotNull
    public static final Object t(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void u(@NotNull View view, @Nullable FP0 fp0) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, fp0);
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.util.Map] */
    public static final void v(@NotNull AppCompatImageView imageView, @Nullable String str) {
        String str2;
        Intrinsics.checkNotNullParameter(imageView, "view");
        if (str != null) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
            if (extensionFromMimeType == null) {
                extensionFromMimeType = "";
            }
            str2 = (String) C6992uV1.a.get(extensionFromMimeType);
            if (str2 == null) {
                str2 = "unknown";
            }
        } else {
            str2 = null;
        }
        int i = R.drawable.jivo_sdk_vic_file;
        if (str2 != null) {
            switch (str2.hashCode()) {
                case 93166550:
                    if (str2.equals("audio")) {
                        i = R.drawable.jivo_sdk_vic_audio;
                    }
                    break;
                case 106642994:
                    if (str2.equals("photo")) {
                        i = R.drawable.jivo_sdk_vic_image;
                    }
                    break;
                case 112202875:
                    if (str2.equals("video")) {
                        i = R.drawable.jivo_sdk_vic_video;
                    }
                    break;
                case 861720859:
                    str2.equals("document");
                    break;
            }
        }
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        InterfaceC6246qw0 interfaceC6246qw0I = LE.i(context);
        Integer numValueOf = Integer.valueOf(i);
        Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C7716xw0.a aVar = new C7716xw0.a(context2);
        aVar.c = numValueOf;
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        aVar.d = new ImageViewTarget(imageView);
        aVar.m = null;
        aVar.n = null;
        aVar.o = null;
        interfaceC6246qw0I.a(aVar.a());
    }

    public static final void w(@NotNull TextView view, @Nullable AbstractC4688jY0 abstractC4688jY0) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (abstractC4688jY0 == null) {
            return;
        }
        if (abstractC4688jY0 instanceof AbstractC4688jY0.e) {
            String string = ((AbstractC4688jY0.e) abstractC4688jY0).a.a;
            if (StringsKt.I(string)) {
                string = view.getContext().getString(R.string.file_name_unknown);
                Intrinsics.checkNotNullExpressionValue(string, "view.context.getString(R.string.file_name_unknown)");
            }
            view.setText(string);
            return;
        }
        if (abstractC4688jY0.equals(AbstractC4688jY0.b.a)) {
            view.setText(view.getContext().getString(R.string.file_download_expired));
        } else if (abstractC4688jY0 instanceof AbstractC4688jY0.a) {
            view.setText(view.getContext().getString(R.string.file_download_unavailable));
        } else {
            view.setText("");
        }
    }

    public static final void x(@NotNull TextView view, @Nullable AbstractC4688jY0 abstractC4688jY0) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (abstractC4688jY0 == null) {
            return;
        }
        Context context = view.getContext();
        if (abstractC4688jY0.equals(AbstractC4688jY0.c.a)) {
            return;
        }
        if (abstractC4688jY0.equals(AbstractC4688jY0.d.a)) {
            view.setVisibility(0);
            view.setClickable(false);
            view.setText(context.getString(R.string.file_link_checking));
            return;
        }
        if (abstractC4688jY0 instanceof AbstractC4688jY0.e) {
            if (((AbstractC4688jY0.e) abstractC4688jY0).a.c) {
                view.setVisibility(0);
                return;
            }
            view.setVisibility(0);
            view.setClickable(true);
            view.setText(context.getString(R.string.message_download));
            view.setPaintFlags(view.getPaintFlags() | 8);
            return;
        }
        if (abstractC4688jY0.equals(AbstractC4688jY0.b.a)) {
            view.setVisibility(8);
        } else if (abstractC4688jY0 instanceof AbstractC4688jY0.a) {
            view.setVisibility(0);
            view.setClickable(false);
            view.setText(context.getString(R.string.download_status_error));
        }
    }

    public static final void y(@NotNull AppCompatImageView view, @Nullable TZ0 tz0) {
        Pair pair;
        Intrinsics.checkNotNullParameter(view, "view");
        if (tz0 instanceof TZ0.c) {
            pair = new Pair(Boolean.TRUE, Integer.valueOf(R.drawable.jivo_sdk_vic_message_status_sending));
        } else if (tz0 instanceof TZ0.d) {
            pair = new Pair(Boolean.TRUE, Integer.valueOf(R.drawable.jivo_sdk_vic_message_status_sent));
        } else if (tz0 instanceof TZ0.a) {
            pair = new Pair(Boolean.TRUE, Integer.valueOf(R.drawable.jivo_sdk_vic_message_status_delivered));
        } else {
            pair = tz0 instanceof TZ0.b ? new Pair(Boolean.TRUE, Integer.valueOf(R.drawable.jivo_sdk_vic_message_status_error)) : new Pair(Boolean.FALSE, 0);
        }
        boolean zBooleanValue = ((Boolean) pair.d).booleanValue();
        view.setImageResource(((Number) pair.e).intValue());
        view.setVisibility(zBooleanValue ? 0 : 4);
    }

    public static final void z(@NotNull TextView view, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (l == null || l.longValue() == 0) {
            return;
        }
        view.setText(DateFormat.getTimeFormat(view.getContext()).format(new Date(l.longValue() * ((long) CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT))));
    }
}
