package defpackage;

import androidx.annotation.NonNull;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: ti1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6829ti1 {
    public static final byte[] a = {112, 114, 111, 0};
    public static final byte[] b = {112, 114, 109, 0};

    @NonNull
    public static byte[] a(@NonNull C6049q00[] c6049q00Arr, @NonNull byte[] bArr) throws IOException {
        int length = 0;
        for (C6049q00 c6049q00 : c6049q00Arr) {
            length += ((((c6049q00.g * 2) + 7) & (-8)) / 8) + (c6049q00.e * 2) + b(bArr, c6049q00.a, c6049q00.b).getBytes(StandardCharsets.UTF_8).length + 16 + c6049q00.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, C7880yi1.c)) {
            for (C6049q00 c6049q01 : c6049q00Arr) {
                j(byteArrayOutputStream, c6049q01, b(bArr, c6049q01.a, c6049q01.b));
                l(byteArrayOutputStream, c6049q01);
                int[] iArr = c6049q01.h;
                int length2 = iArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length2) {
                    int i3 = iArr[i];
                    QO.u(byteArrayOutputStream, i3 - i2);
                    i++;
                    i2 = i3;
                }
                k(byteArrayOutputStream, c6049q01);
            }
        } else {
            for (C6049q00 c6049q02 : c6049q00Arr) {
                j(byteArrayOutputStream, c6049q02, b(bArr, c6049q02.a, c6049q02.b));
            }
            for (C6049q00 c6049q03 : c6049q00Arr) {
                l(byteArrayOutputStream, c6049q03);
                int[] iArr2 = c6049q03.h;
                int length3 = iArr2.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length3) {
                    int i6 = iArr2[i4];
                    QO.u(byteArrayOutputStream, i6 - i5);
                    i4++;
                    i5 = i6;
                }
                k(byteArrayOutputStream, c6049q03);
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    @NonNull
    public static String b(@NonNull byte[] bArr, @NonNull String str, @NonNull String str2) {
        byte[] bArr2 = C7880yi1.e;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = C7880yi1.d;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return C5807oq.b(C1039Gc0.f(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static int[] c(@NonNull ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iN = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iN += (int) QO.n(byteArrayInputStream, 2);
            iArr[i2] = iN;
        }
        return iArr;
    }

    @NonNull
    public static C6049q00[] d(@NonNull FileInputStream fileInputStream, @NonNull byte[] bArr, @NonNull byte[] bArr2, C6049q00[] c6049q00Arr) throws IOException {
        byte[] bArr3 = C7880yi1.f;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, C7880yi1.g)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iN = (int) QO.n(fileInputStream, 2);
            byte[] bArrM = QO.m(fileInputStream, (int) QO.n(fileInputStream, 4), (int) QO.n(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM);
            try {
                C6049q00[] c6049q00ArrF = f(byteArrayInputStream, bArr2, iN, c6049q00Arr);
                byteArrayInputStream.close();
                return c6049q00ArrF;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(C7880yi1.a, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iN2 = (int) QO.n(fileInputStream, 1);
        byte[] bArrM2 = QO.m(fileInputStream, (int) QO.n(fileInputStream, 4), (int) QO.n(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM2);
        try {
            C6049q00[] c6049q00ArrE = e(byteArrayInputStream2, iN2, c6049q00Arr);
            byteArrayInputStream2.close();
            return c6049q00ArrE;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @NonNull
    public static C6049q00[] e(@NonNull ByteArrayInputStream byteArrayInputStream, int i, C6049q00[] c6049q00Arr) {
        if (byteArrayInputStream.available() == 0) {
            return new C6049q00[0];
        }
        if (i != c6049q00Arr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iN = (int) QO.n(byteArrayInputStream, 2);
            iArr[i2] = (int) QO.n(byteArrayInputStream, 2);
            strArr[i2] = new String(QO.l(byteArrayInputStream, iN), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            C6049q00 c6049q00 = c6049q00Arr[i3];
            if (!c6049q00.b.equals(strArr[i3])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            c6049q00.e = i4;
            c6049q00.h = c(byteArrayInputStream, i4);
        }
        return c6049q00Arr;
    }

    @NonNull
    public static C6049q00[] f(@NonNull ByteArrayInputStream byteArrayInputStream, @NonNull byte[] bArr, int i, C6049q00[] c6049q00Arr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new C6049q00[0];
        }
        if (i != c6049q00Arr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            QO.n(byteArrayInputStream, 2);
            String str = new String(QO.l(byteArrayInputStream, (int) QO.n(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jN = QO.n(byteArrayInputStream, 4);
            int iN = (int) QO.n(byteArrayInputStream, 2);
            C6049q00 c6049q00 = null;
            if (c6049q00Arr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i3 = 0; i3 < c6049q00Arr.length; i3++) {
                    if (c6049q00Arr[i3].b.equals(strSubstring)) {
                        c6049q00 = c6049q00Arr[i3];
                        break;
                    }
                }
            }
            if (c6049q00 == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c6049q00.d = jN;
            int[] iArrC = c(byteArrayInputStream, iN);
            if (Arrays.equals(bArr, C7880yi1.e)) {
                c6049q00.e = iN;
                c6049q00.h = iArrC;
            }
        }
        return c6049q00Arr;
    }

    @NonNull
    public static C6049q00[] g(@NonNull FileInputStream fileInputStream, @NonNull byte[] bArr, @NonNull String str) throws IOException {
        if (!Arrays.equals(bArr, C7880yi1.b)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iN = (int) QO.n(fileInputStream, 1);
        byte[] bArrM = QO.m(fileInputStream, (int) QO.n(fileInputStream, 4), (int) QO.n(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM);
        try {
            C6049q00[] c6049q00ArrH = h(byteArrayInputStream, str, iN);
            byteArrayInputStream.close();
            return c6049q00ArrH;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @NonNull
    public static C6049q00[] h(@NonNull ByteArrayInputStream byteArrayInputStream, @NonNull String str, int i) throws IOException {
        TreeMap<Integer, Integer> treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new C6049q00[0];
        }
        C6049q00[] c6049q00Arr = new C6049q00[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iN = (int) QO.n(byteArrayInputStream, 2);
            int iN2 = (int) QO.n(byteArrayInputStream, 2);
            c6049q00Arr[i2] = new C6049q00(str, new String(QO.l(byteArrayInputStream, iN), StandardCharsets.UTF_8), QO.n(byteArrayInputStream, 4), iN2, (int) QO.n(byteArrayInputStream, 4), (int) QO.n(byteArrayInputStream, 4), new int[iN2], new TreeMap());
        }
        for (int i3 = 0; i3 < i; i3++) {
            C6049q00 c6049q00 = c6049q00Arr[i3];
            int iAvailable = byteArrayInputStream.available() - c6049q00.f;
            int iN3 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = c6049q00.i;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iN3 += (int) QO.n(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iN3), 1);
                for (int iN4 = (int) QO.n(byteArrayInputStream, 2); iN4 > 0; iN4--) {
                    QO.n(byteArrayInputStream, 2);
                    int iN5 = (int) QO.n(byteArrayInputStream, 1);
                    if (iN5 != 6 && iN5 != 7) {
                        while (iN5 > 0) {
                            QO.n(byteArrayInputStream, 1);
                            for (int iN6 = (int) QO.n(byteArrayInputStream, 1); iN6 > 0; iN6--) {
                                QO.n(byteArrayInputStream, 2);
                            }
                            iN5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c6049q00.h = c(byteArrayInputStream, c6049q00.e);
            int i4 = c6049q00.g;
            BitSet bitSetValueOf = BitSet.valueOf(QO.l(byteArrayInputStream, (((i4 * 2) + 7) & (-8)) / 8));
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = bitSetValueOf.get(i5) ? 2 : 0;
                if (bitSetValueOf.get(i5 + i4)) {
                    i6 |= 4;
                }
                if (i6 != 0) {
                    Integer num = treeMap.get(Integer.valueOf(i5));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i5), Integer.valueOf(i6 | num.intValue()));
                }
            }
        }
        return c6049q00Arr;
    }

    public static boolean i(@NonNull ByteArrayOutputStream byteArrayOutputStream, @NonNull byte[] bArr, @NonNull C6049q00[] c6049q00Arr) throws IOException {
        long j;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = C7880yi1.a;
        int i = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = C7880yi1.b;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrA = a(c6049q00Arr, bArr3);
                QO.t(byteArrayOutputStream, c6049q00Arr.length, 1);
                QO.t(byteArrayOutputStream, bArrA.length, 4);
                byte[] bArrG = QO.g(bArrA);
                QO.t(byteArrayOutputStream, bArrG.length, 4);
                byteArrayOutputStream.write(bArrG);
                return true;
            }
            byte[] bArr4 = C7880yi1.d;
            if (Arrays.equals(bArr, bArr4)) {
                QO.t(byteArrayOutputStream, c6049q00Arr.length, 1);
                for (C6049q00 c6049q00 : c6049q00Arr) {
                    int size = c6049q00.i.size() * 4;
                    String strB = b(bArr4, c6049q00.a, c6049q00.b);
                    Charset charset = StandardCharsets.UTF_8;
                    QO.u(byteArrayOutputStream, strB.getBytes(charset).length);
                    QO.u(byteArrayOutputStream, c6049q00.h.length);
                    QO.t(byteArrayOutputStream, size, 4);
                    QO.t(byteArrayOutputStream, c6049q00.c, 4);
                    byteArrayOutputStream.write(strB.getBytes(charset));
                    Iterator<Integer> it = c6049q00.i.keySet().iterator();
                    while (it.hasNext()) {
                        QO.u(byteArrayOutputStream, it.next().intValue());
                        QO.u(byteArrayOutputStream, 0);
                    }
                    for (int i2 : c6049q00.h) {
                        QO.u(byteArrayOutputStream, i2);
                    }
                }
                return true;
            }
            byte[] bArr5 = C7880yi1.c;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrA2 = a(c6049q00Arr, bArr5);
                QO.t(byteArrayOutputStream, c6049q00Arr.length, 1);
                QO.t(byteArrayOutputStream, bArrA2.length, 4);
                byte[] bArrG2 = QO.g(bArrA2);
                QO.t(byteArrayOutputStream, bArrG2.length, 4);
                byteArrayOutputStream.write(bArrG2);
                return true;
            }
            byte[] bArr6 = C7880yi1.e;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            QO.u(byteArrayOutputStream, c6049q00Arr.length);
            for (C6049q00 c6049q01 : c6049q00Arr) {
                String strB2 = b(bArr6, c6049q01.a, c6049q01.b);
                Charset charset2 = StandardCharsets.UTF_8;
                QO.u(byteArrayOutputStream, strB2.getBytes(charset2).length);
                TreeMap<Integer, Integer> treeMap = c6049q01.i;
                QO.u(byteArrayOutputStream, treeMap.size());
                QO.u(byteArrayOutputStream, c6049q01.h.length);
                QO.t(byteArrayOutputStream, c6049q01.c, 4);
                byteArrayOutputStream.write(strB2.getBytes(charset2));
                Iterator<Integer> it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    QO.u(byteArrayOutputStream, it2.next().intValue());
                }
                for (int i3 : c6049q01.h) {
                    QO.u(byteArrayOutputStream, i3);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            QO.u(byteArrayOutputStream2, c6049q00Arr.length);
            int i4 = 2;
            int i5 = 2;
            for (C6049q00 c6049q02 : c6049q00Arr) {
                QO.t(byteArrayOutputStream2, c6049q02.c, 4);
                QO.t(byteArrayOutputStream2, c6049q02.d, 4);
                QO.t(byteArrayOutputStream2, c6049q02.g, 4);
                String strB3 = b(bArr2, c6049q02.a, c6049q02.b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strB3.getBytes(charset3).length;
                QO.u(byteArrayOutputStream2, length2);
                i5 = i5 + 14 + length2;
                byteArrayOutputStream2.write(strB3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i5 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            }
            C3642el2 c3642el2 = new C3642el2(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(c3642el2);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i6 = 0;
            int i7 = 0;
            while (i6 < c6049q00Arr.length) {
                try {
                    C6049q00 c6049q03 = c6049q00Arr[i6];
                    QO.u(byteArrayOutputStream3, i6);
                    QO.u(byteArrayOutputStream3, c6049q03.e);
                    i7 = i7 + 4 + (c6049q03.e * i4);
                    int[] iArr = c6049q03.h;
                    int length3 = iArr.length;
                    int i8 = i;
                    int i9 = i4;
                    int i10 = i8;
                    while (i10 < length3) {
                        int i11 = iArr[i10];
                        QO.u(byteArrayOutputStream3, i11 - i8);
                        i10++;
                        i8 = i11;
                    }
                    i6++;
                    i4 = i9;
                    i = 0;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i7 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray2.length);
            }
            C3642el2 c3642el3 = new C3642el2(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c3642el3);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i12 = 0;
            int i13 = 0;
            while (i12 < c6049q00Arr.length) {
                try {
                    C6049q00 c6049q04 = c6049q00Arr[i12];
                    Iterator<Map.Entry<Integer, Integer>> it3 = c6049q04.i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= it3.next().getValue().intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        k(byteArrayOutputStream5, c6049q04);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            l(byteArrayOutputStream6, c6049q04);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            QO.u(byteArrayOutputStream4, i12);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i14 = i13 + 6;
                            ArrayList arrayList4 = arrayList3;
                            QO.t(byteArrayOutputStream4, length4, 4);
                            QO.u(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i13 = i14 + length4;
                            i12++;
                            arrayList3 = arrayList4;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i13 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray5.length);
            }
            C3642el2 c3642el4 = new C3642el2(4, byteArray5, true);
            byteArrayOutputStream4.close();
            arrayList2.add(c3642el4);
            long j2 = 4;
            long size2 = j2 + j2 + 4 + ((long) (arrayList2.size() * 16));
            QO.t(byteArrayOutputStream, arrayList2.size(), 4);
            int i15 = 0;
            while (i15 < arrayList2.size()) {
                C3642el2 c3642el5 = (C3642el2) arrayList2.get(i15);
                int i16 = c3642el5.a;
                if (i16 == 1) {
                    j = 0;
                } else if (i16 == 2) {
                    j = 1;
                } else if (i16 == 3) {
                    j = 2;
                } else if (i16 == 4) {
                    j = 3;
                } else {
                    if (i16 != 5) {
                        throw null;
                    }
                    j = 4;
                }
                QO.t(byteArrayOutputStream, j, 4);
                QO.t(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = c3642el5.b;
                if (c3642el5.c) {
                    long length5 = bArr7.length;
                    byte[] bArrG3 = QO.g(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrG3);
                    QO.t(byteArrayOutputStream, bArrG3.length, 4);
                    QO.t(byteArrayOutputStream, length5, 4);
                    length = bArrG3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    QO.t(byteArrayOutputStream, bArr7.length, 4);
                    QO.t(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i15++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i17));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static void j(@NonNull ByteArrayOutputStream byteArrayOutputStream, @NonNull C6049q00 c6049q00, @NonNull String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        QO.u(byteArrayOutputStream, str.getBytes(charset).length);
        QO.u(byteArrayOutputStream, c6049q00.e);
        QO.t(byteArrayOutputStream, c6049q00.f, 4);
        QO.t(byteArrayOutputStream, c6049q00.c, 4);
        QO.t(byteArrayOutputStream, c6049q00.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void k(@NonNull ByteArrayOutputStream byteArrayOutputStream, @NonNull C6049q00 c6049q00) throws IOException {
        byte[] bArr = new byte[(((c6049q00.g * 2) + 7) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : c6049q00.i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            if ((iIntValue2 & 2) != 0) {
                int i = iIntValue / 8;
                bArr[i] = (byte) (bArr[i] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i2 = iIntValue + c6049q00.g;
                int i3 = i2 / 8;
                bArr[i3] = (byte) ((1 << (i2 % 8)) | bArr[i3]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void l(@NonNull ByteArrayOutputStream byteArrayOutputStream, @NonNull C6049q00 c6049q00) throws IOException {
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : c6049q00.i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                QO.u(byteArrayOutputStream, iIntValue - i);
                QO.u(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }
}
