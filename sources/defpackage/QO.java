package defpackage;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.lifecycle.b;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.pexpress.tool.R;
import io.jsonwebtoken.JwtParser;
import io.sentry.android.core.b0;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class QO implements Continuation, G70, InterfaceC6867tt1 {

    @NotNull
    public static final QO e = new QO(5);
    public static final QO g = new QO(8);
    public final /* synthetic */ int d;

    public /* synthetic */ QO(int i) {
        this.d = i;
    }

    public static b d(InterfaceC6396rf0 interfaceC6396rf0) {
        e context = e.d;
        Intrinsics.checkNotNullParameter(interfaceC6396rf0, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        C7661xg0 block = new C7661xg0(interfaceC6396rf0, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        b bVar = new b();
        XF0.a key = XF0.a.d;
        context.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        C4002gV1 c4002gV1 = new C4002gV1(null);
        RV rv = C6266r20.a;
        AbstractC8109zn0 abstractC8109zn0S1 = QV0.a.s1();
        abstractC8109zn0S1.getClass();
        bVar.m = new C2827at<>(bVar, block, LN.a(CoroutineContext.Element.a.c(abstractC8109zn0S1, context).t(c4002gV1)), new I6(bVar, 1));
        if (interfaceC6396rf0 instanceof FP1) {
            if (C3841fj.w().x()) {
                bVar.k(((FP1) interfaceC6396rf0).getValue());
                return bVar;
            }
            bVar.i(((FP1) interfaceC6396rf0).getValue());
        }
        return bVar;
    }

    public static final void e(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Od2 block = new Od2(view, null);
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(block, "block");
        AH1 ah1 = new AH1();
        ah1.h = C5885pC0.a(ah1, ah1, block);
        while (ah1.hasNext()) {
            View view2 = (View) ah1.next();
            C1283Jf1 c1283Jf1 = (C1283Jf1) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (c1283Jf1 == null) {
                c1283Jf1 = new C1283Jf1();
                view2.setTag(R.id.pooling_container_listener_holder_tag, c1283Jf1);
            }
            ArrayList<InterfaceC1205If1> arrayList = c1283Jf1.a;
            for (int iE = WE.e(arrayList); -1 < iE; iE--) {
                arrayList.get(iE).a();
            }
        }
    }

    @NotNull
    public static final C4991kz f(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new C4991kz(str);
    }

    public static byte[] g(@NonNull byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    public static final String h(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (CollectionsKt.P(new kotlin.ranges.b('0', '9'), Character.valueOf(JwtParser.SEPARATOR_CHAR)).contains(Character.valueOf(cCharAt))) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static String i(Method method) {
        String name = method.getName();
        String strJ = j(name, "get");
        if (strJ == null) {
            strJ = j(name, "set");
        }
        if (strJ == null) {
            strJ = j(name, "is");
        }
        if (strJ == null) {
            strJ = j(name, ProductAction.ACTION_ADD);
        }
        return q(strJ);
    }

    public static String j(String str, String str2) {
        if (str.startsWith(str2)) {
            return str.substring(str2.length());
        }
        return null;
    }

    public static final boolean k(@NotNull String str, @NotNull String other) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        ArrayList arrayListF0 = CollectionsKt.f0(StringsKt__StringsKt.split$default(h(str), new String[]{"."}, false, 0, 6, null));
        while (arrayListF0.size() < 3) {
            arrayListF0.add("0");
        }
        List listSubList = arrayListF0.subList(0, 3);
        ArrayList arrayListF1 = CollectionsKt.f0(StringsKt__StringsKt.split$default(h(other), new String[]{"."}, false, 0, 6, null));
        while (arrayListF1.size() < 3) {
            arrayListF1.add("0");
        }
        List listSubList2 = arrayListF1.subList(0, 3);
        ArrayList arrayList = new ArrayList(XE.m(listSubList, 10));
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
        }
        ArrayList arrayList2 = new ArrayList(XE.m(listSubList2, 10));
        Iterator it2 = listSubList2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(Integer.parseInt((String) it2.next())));
        }
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                WE.l();
                throw null;
            }
            int iIntValue = ((Number) obj).intValue();
            if (iIntValue < ((Number) arrayList2.get(i)).intValue()) {
                return true;
            }
            if (iIntValue > ((Number) arrayList2.get(i)).intValue()) {
                break;
            }
            i = i2;
        }
        return false;
    }

    @NonNull
    public static byte[] l(@NonNull InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                throw new IllegalStateException(EK.e(i, "Not enough bytes to read: "));
            }
            i2 += i3;
        }
        return bArr;
    }

    @NonNull
    public static byte[] m(@NonNull FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            if (i3 == i) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static long n(@NonNull InputStream inputStream, int i) throws IOException {
        byte[] bArrL = l(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrL[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    @NotNull
    public static final String o(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        C1945Rr1[] replacementPairs = {s("١", "1"), s("٢", "2"), s("٣", "3"), s("٤", "4"), s("٥", "5"), s("٦", "6"), s("٧", "7"), s("٨", "8"), s("٩", "9"), s("٠", "0"), s("٬", ","), s("٫", ".")};
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(replacementPairs, "replacementPairs");
        for (int i = 0; i < 12; i++) {
            C1945Rr1 c1945Rr1 = replacementPairs[i];
            str = d.m(str, c1945Rr1.a, c1945Rr1.b);
        }
        return str;
    }

    public static double p(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Double d = IS1.d(str);
        if (d != null) {
            return d.doubleValue();
        }
        return 0.0d;
    }

    public static String q(String str) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty() || (str.length() > 1 && Character.isUpperCase(str.charAt(1)) && Character.isUpperCase(str.charAt(0)))) {
            return str;
        }
        char[] charArray = str.toCharArray();
        charArray[0] = Character.toLowerCase(charArray[0]);
        return new String(charArray);
    }

    @NotNull
    public static final Throwable r(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        Throwable cause = th;
        while (cause instanceof CancellationException) {
            CancellationException cancellationException = (CancellationException) cause;
            if (!Intrinsics.a(cause, cancellationException.getCause())) {
                cause = cancellationException.getCause();
            }
        }
        return cause == null ? th : cause;
    }

    @NotNull
    public static final C1945Rr1 s(@NotNull String str, @NotNull String other) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new C1945Rr1(str, other);
    }

    public static void t(@NonNull ByteArrayOutputStream byteArrayOutputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(@NonNull ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        t(byteArrayOutputStream, i, 2);
    }

    @Override // defpackage.G70
    public void b(@NotNull InterfaceC1490Lx descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + descriptor);
    }

    @Override // defpackage.G70
    public void c(@NotNull FC descriptor, @NotNull ArrayList unresolvedSuperClasses) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(unresolvedSuperClasses, "unresolvedSuperClasses");
        throw new IllegalStateException("Incomplete hierarchy for class " + descriptor.getName() + ", unresolved classes " + unresolvedSuperClasses);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.d) {
            case 0:
                break;
            default:
                if (!task.isSuccessful()) {
                    b0.d("FirebaseCrashlytics", "Error fetching settings.", task.getException());
                }
                break;
        }
        return null;
    }

    @Override // defpackage.InterfaceC6867tt1
    public InterfaceC3667et1 a(@NonNull InterfaceC3667et1 interfaceC3667et1, @NonNull C4227ha1 c4227ha1) {
        return interfaceC3667et1;
    }
}
