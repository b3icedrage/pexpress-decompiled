package io.sentry.android.core.internal.tombstone;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.C0957Fb;
import defpackage.C1039Gc0;
import defpackage.C1625Np;
import defpackage.C1874Qu;
import defpackage.C2741aZ0;
import defpackage.C3057c;
import defpackage.C3476e;
import defpackage.C4578j02;
import defpackage.C4756jq1;
import defpackage.C5189lv;
import defpackage.C5807oq;
import defpackage.C6740tH1;
import defpackage.C8095zj2;
import defpackage.ED;
import defpackage.EG1;
import defpackage.H81;
import defpackage.NG1;
import defpackage.NL1;
import defpackage.OV;
import defpackage.V31;
import io.sentry.android.core.internal.util.l;
import io.sentry.protocol.A;
import io.sentry.protocol.C4522d;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.m;
import io.sentry.protocol.s;
import io.sentry.protocol.y;
import io.sentry.protocol.z;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Closeable {

    @Nullable
    public final InputStream d;

    @NotNull
    public final List<String> e;

    @NotNull
    public final List<String> g;

    @Nullable
    public final String h;
    public final HashMap i;

    public static class a {
        public String a;
        public String b;
        public long c;
        public long d;

        public final DebugImage a() {
            String str = this.b;
            if (str.isEmpty()) {
                return null;
            }
            DebugImage debugImage = new DebugImage();
            debugImage.setCodeId(str);
            debugImage.setCodeFile(this.a);
            String strA = l.a(str);
            if (strA != null) {
                str = strA;
            }
            debugImage.setDebugId(str);
            long j = this.c;
            debugImage.setImageAddr(String.format("0x%x", Long.valueOf(j)));
            debugImage.setImageSize(this.d - j);
            debugImage.setType("elf");
            return debugImage;
        }
    }

    public b(@Nullable InputStream inputStream, @NotNull List<String> list, @NotNull List<String> list2, @Nullable String str) {
        HashMap map = new HashMap();
        this.i = map;
        this.d = inputStream;
        this.e = list;
        this.g = list2;
        this.h = str;
        map.put("SIGILL", "IllegalInstruction");
        map.put("SIGTRAP", "Trap");
        map.put("SIGABRT", "Abort");
        map.put("SIGBUS", "BusError");
        map.put("SIGFPE", "FloatingPointException");
        map.put("SIGSEGV", "Segfault");
    }

    @NonNull
    public final EG1 c() throws IOException {
        DebugImage debugImageA;
        DebugImage debugImageA2;
        C8095zj2 c8095zj2;
        ArrayList arrayList;
        ArrayList arrayList2;
        HashMap map;
        C8095zj2 c8095zj3;
        ArrayList arrayList3;
        HashMap map2;
        C8095zj2 c8095zj4;
        ArrayList arrayList4;
        HashMap map3;
        C8095zj2 c8095zj5;
        C8095zj2 c8095zj6;
        InputStream inputStream = this.d;
        if (inputStream == null) {
            throw new IOException("No InputStream provided; use parse(Tombstone) instead.");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
        C8095zj2 c8095zj7 = new C8095zj2(byteArrayOutputStream.toByteArray());
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        HashMap map4 = new HashMap();
        HashMap map5 = new HashMap();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        String str = "";
        int iG = 0;
        int iG2 = 0;
        String strE = "";
        NL1 nl1 = null;
        while (true) {
            int iF = c8095zj7.f();
            if (iF == 0) {
                String str2 = str;
                int i2 = iG2;
                List listUnmodifiableList = Collections.unmodifiableList(arrayList5);
                Collections.unmodifiableList(arrayList6);
                Collections.unmodifiableList(arrayList7);
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map4);
                Collections.unmodifiableMap(map5);
                List<C2741aZ0> listUnmodifiableList2 = Collections.unmodifiableList(arrayList8);
                Collections.unmodifiableList(arrayList9);
                Collections.unmodifiableList(arrayList10);
                EG1 eg1 = new EG1();
                eg1.y = NG1.FATAL;
                eg1.l = "native";
                m mVar = new m();
                StringBuilder sb = new StringBuilder();
                Iterator it = listUnmodifiableList.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb.append((CharSequence) it.next());
                        if (it.hasNext()) {
                            sb.append((CharSequence) " ");
                        }
                    }
                }
                String string = sb.toString();
                if (nl1 != null) {
                    Locale locale = Locale.ROOT;
                    String strConcat = !strE.isEmpty() ? strE.concat(": ") : str2;
                    String str3 = nl1.b;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(strConcat);
                    sb2.append("Fatal signal ");
                    sb2.append(str3);
                    sb2.append(" (");
                    sb2.append(nl1.a);
                    sb2.append("), ");
                    sb2.append(nl1.d);
                    sb2.append(" (");
                    sb2.append(nl1.c);
                    sb2.append("), pid = ");
                    sb2.append(iG);
                    sb2.append(" (");
                    mVar.d = C5807oq.b(sb2, string, ")");
                } else {
                    Locale locale2 = Locale.ROOT;
                    mVar.d = "Fatal exit pid = " + iG + " (" + string + ")";
                }
                eg1.u = mVar;
                ArrayList arrayList11 = new ArrayList();
                a aVar = null;
                for (C2741aZ0 c2741aZ0 : listUnmodifiableList2) {
                    if (c2741aZ0.d) {
                        String str4 = c2741aZ0.e;
                        if (!str4.isEmpty() && !str4.startsWith("/dev/")) {
                            String str5 = c2741aZ0.f;
                            boolean zIsEmpty = str5.isEmpty();
                            boolean z = c2741aZ0.c == 0;
                            long j = c2741aZ0.b;
                            if (zIsEmpty || !z) {
                                if (aVar != null && str4.equals(aVar.a)) {
                                    aVar.d = j;
                                }
                            } else if (aVar == null || !str4.equals(aVar.a)) {
                                if (aVar != null && (debugImageA2 = aVar.a()) != null) {
                                    arrayList11.add(debugImageA2);
                                }
                                a aVar2 = new a();
                                aVar2.a = str4;
                                aVar2.b = str5;
                                aVar2.c = c2741aZ0.a;
                                aVar2.d = j;
                                aVar = aVar2;
                            } else {
                                aVar.d = j;
                            }
                        }
                    }
                }
                if (aVar != null && (debugImageA = aVar.a()) != null) {
                    arrayList11.add(debugImageA);
                }
                C4522d c4522d = new C4522d();
                c4522d.e = new ArrayList(arrayList11);
                eg1.r = c4522d;
                s sVar = new s();
                if (nl1 != null) {
                    String str6 = nl1.b;
                    sVar.d = str6;
                    sVar.e = (String) this.i.get(str6);
                    io.sentry.protocol.l lVar = new io.sentry.protocol.l();
                    lVar.d = io.sentry.android.core.internal.tombstone.a.TOMBSTONE.getValue();
                    lVar.h = Boolean.FALSE;
                    lVar.k = Boolean.TRUE;
                    HashMap map6 = new HashMap();
                    map6.put("number", Integer.valueOf(nl1.a));
                    map6.put(AppMeasurementSdk.ConditionalUserProperty.NAME, nl1.b);
                    map6.put("code", Integer.valueOf(nl1.c));
                    map6.put("code_name", nl1.d);
                    lVar.i = new HashMap(map6);
                    sVar.j = lVar;
                }
                sVar.h = Long.valueOf(i2);
                ArrayList arrayList12 = new ArrayList(1);
                arrayList12.add(sVar);
                eg1.x = new H81(arrayList12);
                ArrayList arrayListC = eg1.c();
                Objects.requireNonNull(arrayListC);
                s sVar2 = (s) arrayListC.get(0);
                ArrayList arrayList13 = new ArrayList();
                for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
                    C4578j02 c4578j02 = (C4578j02) entry.getValue();
                    A a2 = new A();
                    a2.d = Long.valueOf(((Integer) entry.getKey()).intValue());
                    a2.g = c4578j02.b;
                    ArrayList arrayList14 = new ArrayList();
                    for (C1625Np c1625Np : c4578j02.f) {
                        if (!c1625Np.c.endsWith("libart.so")) {
                            String str7 = c1625Np.c;
                            boolean zStartsWith = str7.startsWith("<anonymous");
                            String str8 = c1625Np.b;
                            if (!zStartsWith || !str8.isEmpty()) {
                                y yVar = new y();
                                yVar.p = str7;
                                yVar.i = str8;
                                yVar.u = String.format("0x%x", Long.valueOf(c1625Np.a));
                                Boolean boolC = str8.isEmpty() ? Boolean.FALSE : C6740tH1.c(str8, this.e, this.g);
                                String str9 = this.h;
                                yVar.o = Boolean.valueOf((boolC != null && boolC.booleanValue()) || (str9 != null && str7.startsWith(str9)));
                                arrayList14.add(0, yVar);
                            }
                        }
                    }
                    z zVar = new z();
                    zVar.d = arrayList14;
                    zVar.h = z.b.NONE;
                    HashMap map7 = new HashMap();
                    for (C4756jq1 c4756jq1 : c4578j02.c) {
                        map7.put(c4756jq1.a, String.format("0x%x", Long.valueOf(c4756jq1.b)));
                    }
                    zVar.e = map7;
                    a2.m = zVar;
                    if (i2 == c4578j02.a) {
                        a2.i = Boolean.TRUE;
                        sVar2.i = zVar;
                    }
                    arrayList13.add(a2);
                }
                eg1.w = new H81(arrayList13);
                return eg1;
            }
            int i3 = iF >>> 3;
            int i4 = iF & 7;
            String str10 = str;
            switch (i3) {
                case 1:
                    c8095zj2 = c8095zj7;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map = map4;
                    iG2 = iG2;
                    C8095zj2.a(i3, 0, i4);
                    int iG3 = (int) c8095zj2.g();
                    int[] iArrH = C1039Gc0.h(6);
                    int length = iArrH.length;
                    for (int i5 = 0; i5 < length && C1039Gc0.g(iArrH[i5]) != iG3; i5++) {
                    }
                    iG2 = iG2;
                    break;
                case 2:
                    c8095zj2 = c8095zj7;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map = map4;
                    iG2 = iG2;
                    C8095zj2.a(i3, 2, i4);
                    c8095zj2.e();
                    iG2 = iG2;
                    break;
                case 3:
                    c8095zj2 = c8095zj7;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map = map4;
                    iG2 = iG2;
                    C8095zj2.a(i3, 2, i4);
                    c8095zj2.e();
                    iG2 = iG2;
                    break;
                case 4:
                    c8095zj2 = c8095zj7;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map = map4;
                    iG2 = iG2;
                    C8095zj2.a(i3, 2, i4);
                    c8095zj2.e();
                    iG2 = iG2;
                    break;
                case 5:
                    c8095zj2 = c8095zj7;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map = map4;
                    iG2 = iG2;
                    C8095zj2.a(i3, 0, i4);
                    iG = (int) c8095zj2.g();
                    iG2 = iG2;
                    break;
                case 6:
                    c8095zj2 = c8095zj7;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map = map4;
                    C8095zj2.a(i3, 0, i4);
                    iG2 = (int) c8095zj2.g();
                    break;
                case 7:
                    c8095zj2 = c8095zj7;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map = map4;
                    iG2 = iG2;
                    C8095zj2.a(i3, 0, i4);
                    c8095zj2.g();
                    iG2 = iG2;
                    break;
                case 8:
                    c8095zj2 = c8095zj7;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map = map4;
                    iG2 = iG2;
                    C8095zj2.a(i3, 2, i4);
                    c8095zj2.e();
                    iG2 = iG2;
                    break;
                case 9:
                    c8095zj2 = c8095zj7;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map = map4;
                    iG2 = iG2;
                    C8095zj2.a(i3, 2, i4);
                    arrayList5.add(c8095zj2.e());
                    iG2 = iG2;
                    break;
                case 10:
                    c8095zj2 = c8095zj7;
                    arrayList = arrayList6;
                    map = map4;
                    iG2 = iG2;
                    C8095zj2.a(i3, 2, i4);
                    C8095zj2 c8095zj2D = c8095zj2.d();
                    String strE2 = str10;
                    String strE3 = strE2;
                    int iG4 = 0;
                    int iG5 = 0;
                    while (true) {
                        int iF2 = c8095zj2D.f();
                        if (iF2 == 0) {
                            arrayList2 = arrayList7;
                            nl1 = new NL1(iG4, iG5, strE2, strE3);
                            iG2 = iG2;
                        } else {
                            int i6 = iF2 >>> 3;
                            int i7 = iF2 & 7;
                            switch (i6) {
                                case 1:
                                    C8095zj2.a(i6, 0, i7);
                                    iG4 = (int) c8095zj2D.g();
                                    break;
                                case 2:
                                    C8095zj2.a(i6, 2, i7);
                                    strE2 = c8095zj2D.e();
                                    break;
                                case 3:
                                    C8095zj2.a(i6, 0, i7);
                                    iG5 = (int) c8095zj2D.g();
                                    break;
                                case 4:
                                    C8095zj2.a(i6, 2, i7);
                                    strE3 = c8095zj2D.e();
                                    break;
                                case 5:
                                    C8095zj2.a(i6, 0, i7);
                                    c8095zj2D.b();
                                    break;
                                case 6:
                                    C8095zj2.a(i6, 0, i7);
                                    c8095zj2D.g();
                                    break;
                                case 7:
                                    C8095zj2.a(i6, 0, i7);
                                    c8095zj2D.g();
                                    break;
                                case 8:
                                    C8095zj2.a(i6, 0, i7);
                                    c8095zj2D.b();
                                    break;
                                case 9:
                                    C8095zj2.a(i6, 0, i7);
                                    c8095zj2D.g();
                                    break;
                                case 10:
                                    C8095zj2.a(i6, 2, i7);
                                    C1874Qu.j(c8095zj2D.d());
                                    break;
                                default:
                                    c8095zj2D.h(i7);
                                    break;
                            }
                            arrayList7 = arrayList7;
                        }
                        break;
                    }
                    break;
                case 11:
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                case 13:
                default:
                    c8095zj7.h(i4);
                    c8095zj2 = c8095zj7;
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map = map4;
                    iG2 = iG2;
                    iG2 = iG2;
                    break;
                case 14:
                    c8095zj2 = c8095zj7;
                    arrayList = arrayList6;
                    map = map4;
                    C8095zj2.a(i3, 2, i4);
                    strE = c8095zj2.e();
                    arrayList2 = arrayList7;
                    iG2 = iG2;
                    break;
                case 15:
                    c8095zj2 = c8095zj7;
                    C8095zj2.a(i3, 2, i4);
                    C8095zj2 c8095zj2D2 = c8095zj2.d();
                    while (true) {
                        int iF3 = c8095zj2D2.f();
                        if (iF3 == 0) {
                            arrayList = arrayList6;
                            map = map4;
                            arrayList7.add(new C0957Fb());
                            arrayList2 = arrayList7;
                            iG2 = iG2;
                        } else {
                            int i8 = iF3 >>> 3;
                            int i9 = iF3 & 7;
                            if (i8 == 1) {
                                c8095zj3 = c8095zj2D2;
                                arrayList3 = arrayList6;
                                map2 = map4;
                                C8095zj2.a(i8, 2, i9);
                                c8095zj3.e();
                            } else if (i8 != 2) {
                                c8095zj2D2.h(i9);
                                c8095zj3 = c8095zj2D2;
                                arrayList3 = arrayList6;
                                map2 = map4;
                            } else {
                                C8095zj2.a(i8, 2, i9);
                                C8095zj2 c8095zj2D3 = c8095zj2D2.d();
                                while (true) {
                                    int iF4 = c8095zj2D3.f();
                                    if (iF4 != 0) {
                                        int i10 = iF4 >>> 3;
                                        int i11 = iF4 & 7;
                                        if (i10 == 1) {
                                            c8095zj4 = c8095zj2D2;
                                            arrayList4 = arrayList6;
                                            map3 = map4;
                                            C8095zj2.a(i10, 0, i11);
                                            int iG6 = (int) c8095zj2D3.g();
                                            int[] iArrH2 = C1039Gc0.h(2);
                                            int length2 = iArrH2.length;
                                            for (int i12 = 0; i12 < length2 && C1039Gc0.g(iArrH2[i12]) != iG6; i12++) {
                                            }
                                        } else if (i10 == 2) {
                                            c8095zj4 = c8095zj2D2;
                                            arrayList4 = arrayList6;
                                            map3 = map4;
                                            C8095zj2.a(i10, 0, i11);
                                            int iG7 = (int) c8095zj2D3.g();
                                            int[] iArrH3 = C1039Gc0.h(6);
                                            int length3 = iArrH3.length;
                                            for (int i13 = 0; i13 < length3 && C1039Gc0.g(iArrH3[i13]) != iG7; i13++) {
                                            }
                                        } else if (i10 != 3) {
                                            c8095zj2D3.h(i11);
                                            c8095zj4 = c8095zj2D2;
                                            arrayList4 = arrayList6;
                                            map3 = map4;
                                        } else {
                                            C8095zj2.a(i10, 2, i11);
                                            C8095zj2 c8095zj2D4 = c8095zj2D3.d();
                                            ArrayList arrayList15 = new ArrayList();
                                            ArrayList arrayList16 = new ArrayList();
                                            while (true) {
                                                int iF5 = c8095zj2D4.f();
                                                if (iF5 != 0) {
                                                    C8095zj2 c8095zj8 = c8095zj2D2;
                                                    int i14 = iF5 >>> 3;
                                                    ArrayList arrayList17 = arrayList6;
                                                    int i15 = iF5 & 7;
                                                    switch (i14) {
                                                        case 1:
                                                            map4 = map4;
                                                            C8095zj2.a(i14, 0, i15);
                                                            c8095zj2D4.g();
                                                            break;
                                                        case 2:
                                                            map4 = map4;
                                                            C8095zj2.a(i14, 0, i15);
                                                            c8095zj2D4.g();
                                                            break;
                                                        case 3:
                                                            map4 = map4;
                                                            C8095zj2.a(i14, 0, i15);
                                                            c8095zj2D4.g();
                                                            break;
                                                        case 4:
                                                            C8095zj2.a(i14, 2, i15);
                                                            arrayList15.add(C1874Qu.h(c8095zj2D4.d()));
                                                            break;
                                                        case 5:
                                                            map4 = map4;
                                                            C8095zj2.a(i14, 0, i15);
                                                            c8095zj2D4.g();
                                                            break;
                                                        case 6:
                                                            C8095zj2.a(i14, 2, i15);
                                                            arrayList16.add(C1874Qu.h(c8095zj2D4.d()));
                                                            break;
                                                        default:
                                                            c8095zj2D4.h(i15);
                                                            break;
                                                    }
                                                    c8095zj2D2 = c8095zj8;
                                                    arrayList6 = arrayList17;
                                                    map4 = map4;
                                                } else {
                                                    c8095zj4 = c8095zj2D2;
                                                    arrayList4 = arrayList6;
                                                    map3 = map4;
                                                    Collections.unmodifiableList(arrayList15);
                                                    Collections.unmodifiableList(arrayList16);
                                                }
                                            }
                                        }
                                        c8095zj2D2 = c8095zj4;
                                        arrayList6 = arrayList4;
                                        map4 = map3;
                                    } else {
                                        c8095zj3 = c8095zj2D2;
                                        arrayList3 = arrayList6;
                                        map2 = map4;
                                    }
                                }
                            }
                            c8095zj2D2 = c8095zj3;
                            arrayList6 = arrayList3;
                            map4 = map2;
                        }
                        break;
                    }
                    break;
                case 16:
                    c8095zj2 = c8095zj7;
                    iG2 = iG2;
                    C8095zj2.a(i3, 2, i4);
                    C1874Qu.k(c8095zj2.d(), map4);
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map = map4;
                    iG2 = iG2;
                    break;
                case 17:
                    c8095zj2 = c8095zj7;
                    iG2 = iG2;
                    C8095zj2.a(i3, 2, i4);
                    C8095zj2 c8095zj2D5 = c8095zj2.d();
                    String strE4 = str10;
                    String strE5 = strE4;
                    long jG = 0;
                    long jG2 = 0;
                    long jG3 = 0;
                    boolean zB = false;
                    while (true) {
                        int iF6 = c8095zj2D5.f();
                        if (iF6 == 0) {
                            arrayList8.add(new C2741aZ0(jG, jG2, jG3, zB, strE4, strE5));
                            arrayList = arrayList6;
                            arrayList2 = arrayList7;
                            map = map4;
                            iG2 = iG2;
                            break;
                        } else {
                            int i16 = iF6 >>> 3;
                            int i17 = iF6 & 7;
                            switch (i16) {
                                case 1:
                                    C8095zj2.a(i16, 0, i17);
                                    jG = c8095zj2D5.g();
                                    break;
                                case 2:
                                    C8095zj2.a(i16, 0, i17);
                                    jG2 = c8095zj2D5.g();
                                    break;
                                case 3:
                                    C8095zj2.a(i16, 0, i17);
                                    jG3 = c8095zj2D5.g();
                                    break;
                                case 4:
                                    C8095zj2.a(i16, 0, i17);
                                    zB = c8095zj2D5.b();
                                    break;
                                case 5:
                                    C8095zj2.a(i16, 0, i17);
                                    c8095zj2D5.b();
                                    break;
                                case 6:
                                    C8095zj2.a(i16, 0, i17);
                                    c8095zj2D5.b();
                                    break;
                                case 7:
                                    C8095zj2.a(i16, 2, i17);
                                    strE4 = c8095zj2D5.e();
                                    break;
                                case 8:
                                    C8095zj2.a(i16, 2, i17);
                                    strE5 = c8095zj2D5.e();
                                    break;
                                case 9:
                                    C8095zj2.a(i16, 0, i17);
                                    c8095zj2D5.g();
                                    break;
                                default:
                                    c8095zj2D5.h(i17);
                                    break;
                            }
                        }
                    }
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    c8095zj2 = c8095zj7;
                    iG2 = iG2;
                    C8095zj2.a(i3, 2, i4);
                    C8095zj2 c8095zj2D6 = c8095zj2.d();
                    ArrayList arrayList18 = new ArrayList();
                    while (true) {
                        int iF7 = c8095zj2D6.f();
                        if (iF7 == 0) {
                            arrayList9.add(new OV(arrayList18));
                            arrayList = arrayList6;
                            arrayList2 = arrayList7;
                            map = map4;
                            iG2 = iG2;
                        } else {
                            int i18 = iF7 >>> 3;
                            int i19 = iF7 & 7;
                            if (i18 == 1) {
                                c8095zj5 = c8095zj2D6;
                                C8095zj2.a(i18, 2, i19);
                                c8095zj5.e();
                            } else if (i18 != 2) {
                                c8095zj2D6.h(i19);
                                c8095zj5 = c8095zj2D6;
                            } else {
                                C8095zj2.a(i18, 2, i19);
                                C8095zj2 c8095zj2D7 = c8095zj2D6.d();
                                while (true) {
                                    int iF8 = c8095zj2D7.f();
                                    if (iF8 != 0) {
                                        int i20 = iF8 >>> 3;
                                        int i21 = iF8 & 7;
                                        switch (i20) {
                                            case 1:
                                                C8095zj2.a(i20, 2, i21);
                                                c8095zj2D7.e();
                                                break;
                                            case 2:
                                                C8095zj2.a(i20, 0, i21);
                                                c8095zj2D7.g();
                                                break;
                                            case 3:
                                                C8095zj2.a(i20, 0, i21);
                                                c8095zj2D7.g();
                                                break;
                                            case 4:
                                                C8095zj2.a(i20, 0, i21);
                                                c8095zj2D7.g();
                                                break;
                                            case 5:
                                                C8095zj2.a(i20, 2, i21);
                                                c8095zj2D7.e();
                                                break;
                                            case 6:
                                                C8095zj2.a(i20, 2, i21);
                                                c8095zj2D7.e();
                                                break;
                                            default:
                                                c8095zj2D7.h(i21);
                                                break;
                                        }
                                        c8095zj2D6 = c8095zj2D6;
                                    } else {
                                        c8095zj5 = c8095zj2D6;
                                        arrayList18.add(new C3476e());
                                    }
                                }
                            }
                            c8095zj2D6 = c8095zj5;
                        }
                        break;
                    }
                    break;
                case 19:
                    c8095zj2 = c8095zj7;
                    iG2 = iG2;
                    C8095zj2.a(i3, 2, i4);
                    C8095zj2 c8095zj2D8 = c8095zj2.d();
                    while (true) {
                        int iF9 = c8095zj2D8.f();
                        if (iF9 == 0) {
                            arrayList10.add(new ED());
                            arrayList = arrayList6;
                            arrayList2 = arrayList7;
                            map = map4;
                            iG2 = iG2;
                            break;
                        } else {
                            int i22 = iF9 >>> 3;
                            int i23 = iF9 & 7;
                            if (i22 == 1) {
                                C8095zj2.a(i22, 0, i23);
                                c8095zj2D8.g();
                            } else if (i22 == 2) {
                                C8095zj2.a(i22, 2, i23);
                                c8095zj2D8.e();
                            } else if (i22 == 3) {
                                C8095zj2.a(i22, 2, i23);
                                c8095zj2D8.e();
                            } else if (i22 != 4) {
                                c8095zj2D8.h(i23);
                            } else {
                                C8095zj2.a(i22, 0, i23);
                                c8095zj2D8.g();
                            }
                        }
                    }
                    break;
                case 20:
                    c8095zj2 = c8095zj7;
                    iG2 = iG2;
                    C8095zj2.a(i3, 0, i4);
                    c8095zj2.g();
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map = map4;
                    iG2 = iG2;
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    c8095zj2 = c8095zj7;
                    iG2 = iG2;
                    C8095zj2.a(i3, 2, i4);
                    C8095zj2 c8095zj2D9 = c8095zj2.d();
                    while (true) {
                        int iF10 = c8095zj2D9.f();
                        if (iF10 == 0) {
                            arrayList6.add(new C3057c());
                            arrayList = arrayList6;
                            arrayList2 = arrayList7;
                            map = map4;
                            iG2 = iG2;
                            break;
                        } else {
                            int i24 = iF10 >>> 3;
                            int i25 = iF10 & 7;
                            if (i24 == 1) {
                                C8095zj2.a(i24, 2, i25);
                                c8095zj2D9.c();
                            } else if (i24 != 2) {
                                c8095zj2D9.h(i25);
                            } else {
                                C8095zj2.a(i24, 2, i25);
                                c8095zj2D9.c();
                            }
                        }
                    }
                    break;
                case 22:
                    c8095zj2 = c8095zj7;
                    iG2 = iG2;
                    C8095zj2.a(i3, 0, i4);
                    c8095zj2.g();
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map = map4;
                    iG2 = iG2;
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    c8095zj2 = c8095zj7;
                    iG2 = iG2;
                    C8095zj2.a(i3, 0, i4);
                    c8095zj2.b();
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map = map4;
                    iG2 = iG2;
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    c8095zj2 = c8095zj7;
                    iG2 = iG2;
                    C8095zj2.a(i3, 0, i4);
                    int iG8 = (int) c8095zj2.g();
                    int[] iArrH4 = C1039Gc0.h(6);
                    int length4 = iArrH4.length;
                    for (int i26 = 0; i26 < length4 && C1039Gc0.g(iArrH4[i26]) != iG8; i26++) {
                    }
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map = map4;
                    iG2 = iG2;
                    break;
                case 25:
                    c8095zj2 = c8095zj7;
                    iG2 = iG2;
                    C8095zj2.a(i3, 2, i4);
                    C1874Qu.k(c8095zj2.d(), map5);
                    arrayList = arrayList6;
                    arrayList2 = arrayList7;
                    map = map4;
                    iG2 = iG2;
                    break;
                case 26:
                    C8095zj2.a(i3, 2, i4);
                    C8095zj2 c8095zj2D10 = c8095zj7.d();
                    ArrayList arrayList19 = new ArrayList();
                    while (true) {
                        int iF11 = c8095zj2D10.f();
                        if (iF11 == 0) {
                            c8095zj2 = c8095zj7;
                            iG2 = iG2;
                            Collections.unmodifiableList(arrayList19);
                            arrayList = arrayList6;
                            arrayList2 = arrayList7;
                            map = map4;
                            iG2 = iG2;
                        } else {
                            C8095zj2 c8095zj9 = c8095zj7;
                            int i27 = iF11 >>> 3;
                            int i28 = iF11 & 7;
                            int i29 = iG2;
                            if (i27 == 1) {
                                c8095zj6 = c8095zj2D10;
                                C8095zj2.a(i27, 0, i28);
                                c8095zj6.g();
                            } else if (i27 != 2) {
                                c8095zj2D10.h(i28);
                                c8095zj6 = c8095zj2D10;
                            } else {
                                C8095zj2.a(i27, 2, i28);
                                C8095zj2 c8095zj2D11 = c8095zj2D10.d();
                                while (true) {
                                    int iF12 = c8095zj2D11.f();
                                    if (iF12 != 0) {
                                        int i30 = iF12 >>> 3;
                                        int i31 = iF12 & 7;
                                        C8095zj2 c8095zj10 = c8095zj2D10;
                                        if (i30 == 1) {
                                            C8095zj2.a(i30, 2, i31);
                                            C1874Qu.h(c8095zj2D11.d());
                                        } else if (i30 == 2) {
                                            C8095zj2.a(i30, 0, i31);
                                            c8095zj2D11.g();
                                        } else if (i30 != 3) {
                                            c8095zj2D11.h(i31);
                                        } else {
                                            C8095zj2.a(i30, 0, i31);
                                            c8095zj2D11.g();
                                        }
                                        c8095zj2D10 = c8095zj10;
                                    } else {
                                        c8095zj6 = c8095zj2D10;
                                        arrayList19.add(new C5189lv());
                                    }
                                }
                            }
                            c8095zj2D10 = c8095zj6;
                            c8095zj7 = c8095zj9;
                            iG2 = i29;
                        }
                        break;
                    }
                    break;
            }
            str = str10;
            arrayList7 = arrayList2;
            c8095zj7 = c8095zj2;
            arrayList6 = arrayList;
            map4 = map;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            inputStream.close();
        }
    }
}
