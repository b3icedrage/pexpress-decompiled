package defpackage;

import android.view.View;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.pexpress.tool.R;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class ED implements C2943bS.b, InterfaceC3646em2 {

    @NotNull
    public static final C4466ii d = new C4466ii();

    @NotNull
    public static final C4466ii e = new C4466ii();

    @NotNull
    public static final C4466ii g = new C4466ii();

    @NotNull
    public static final C4466ii h = new C4466ii();

    @NotNull
    public static final C4466ii i = new C4466ii();

    @NotNull
    public static final ED j = new ED();

    @NotNull
    public static final GW1 k = new GW1("NO_OWNER");
    public static ED l;

    public static C2684aG0 b() {
        return new C2684aG0(null);
    }

    public static C4795k21 c() {
        return new C4795k21(false);
    }

    public static final void d(@NotNull CoroutineContext coroutineContext, @Nullable CancellationException cancellationException) {
        XF0 xf0 = (XF0) coroutineContext.p(XF0.a.d);
        if (xf0 != null) {
            xf0.l(cancellationException);
        }
    }

    public static void e(CoroutineContext coroutineContext) {
        Sequence<XF0> sequenceC;
        XF0 xf0 = (XF0) coroutineContext.p(XF0.a.d);
        if (xf0 == null || (sequenceC = xf0.c()) == null) {
            return;
        }
        Iterator<XF0> it = sequenceC.iterator();
        while (it.hasNext()) {
            it.next().l(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (r7 == 0) goto L41;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Long f(@org.jetbrains.annotations.NotNull defpackage.AbstractC8135zw r11, @org.jetbrains.annotations.NotNull defpackage.AbstractC8135zw r12, long r13, @org.jetbrains.annotations.NotNull defpackage.LM r15) {
        /*
            boolean r0 = r15 instanceof defpackage.KH1
            if (r0 == 0) goto L13
            r0 = r15
            KH1 r0 = (defpackage.KH1) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            KH1 r0 = new KH1
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.i
            MN r1 = defpackage.MN.d
            int r1 = r0.j
            r2 = 0
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L83
            if (r1 == r4) goto L66
            r11 = 2
            if (r1 == r11) goto L41
            r11 = 3
            if (r1 != r11) goto L39
            long r11 = r0.h
            long r13 = r0.g
            zw r1 = r0.e
            zw r6 = r0.d
            defpackage.C1795Pt1.b(r15)
            r7 = r2
            goto L57
        L39:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L41:
            long r11 = r0.h
            long r13 = r0.g
            zw r1 = r0.e
            zw r6 = r0.d
            defpackage.C1795Pt1.b(r15)
            java.lang.Number r15 = (java.lang.Number) r15
            long r7 = r15.longValue()
            int r15 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r15 != 0) goto L57
            goto La2
        L57:
            long r11 = r11 - r7
            int r15 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r15 > 0) goto L62
            r9 = r11
            r11 = r6
            r6 = r13
            r13 = r9
            r12 = r1
            goto L9c
        L62:
            r1.getClass()
            throw r5
        L66:
            long r11 = r0.h
            long r13 = r0.g
            zw r1 = r0.e
            zw r0 = r0.d
            defpackage.C1795Pt1.b(r15)
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 != 0) goto L7a
            goto La2
        L7a:
            r0.getClass()
            java.lang.String r11 = "dst"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r11)
            throw r5
        L83:
            defpackage.C1795Pt1.b(r15)
            if (r11 == r12) goto Lb7
            java.lang.Throwable r15 = r11.b()
            if (r15 == 0) goto L9b
            java.lang.Throwable r11 = r11.b()
            r12.a(r11)
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r2)
            return r11
        L9b:
            r6 = r13
        L9c:
            int r15 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r15 > 0) goto La9
            r11 = r13
            r13 = r6
        La2:
            long r13 = r13 - r11
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r13)
            return r11
        La9:
            r0.d = r11
            r0.e = r12
            r0.g = r6
            r0.h = r13
            r0.j = r4
            r11.getClass()
            throw r5
        Lb7:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Failed requirement."
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ED.f(zw, zw, long, LM):java.lang.Long");
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01f9 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x01f5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00bc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:36:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:60:0x0157 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x0159 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x0160 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0162 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x0169 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x016b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x0177  */
    /* JADX WARN: Code duplicated, block: B:74:0x0182 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0184 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:77:0x019c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x019e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x01c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x0114 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public static final int g(@NotNull ByteBuffer encodeUTF8, @NotNull CharSequence text, int i2, int i3, int i4, int i5) {
        short s;
        short s2;
        int i6;
        int i7;
        int i8;
        int iCharAt;
        int i9;
        int iCharAt2;
        int i10 = 3;
        int i11 = 1;
        Intrinsics.checkNotNullParameter(encodeUTF8, "$this$encodeUTF8");
        Intrinsics.checkNotNullParameter(text, "text");
        short s3 = 65535;
        int iMin = Math.min(i3, i2 + 65535);
        int i12 = i5;
        if (i12 > 65535) {
            i12 = 65535;
        }
        int i13 = i2;
        int i14 = i4;
        while (i14 < i12 && i13 < iMin) {
            int i15 = i13 + 1;
            char cCharAt = text.charAt(i13);
            int i16 = cCharAt & 65535;
            if ((cCharAt & 65408) != 0) {
                int i17 = i12 - 3;
                while (true) {
                    int i18 = 4;
                    i6 = i10;
                    s = s3;
                    if (i17 - i14 <= 0 || i13 >= iMin) {
                        break;
                    }
                    int i19 = i13 + 1;
                    char cCharAt2 = text.charAt(i13);
                    if (Character.isHighSurrogate(cCharAt2)) {
                        if (i19 == iMin || !Character.isLowSurrogate(text.charAt(i19))) {
                            i13 = i19;
                            i9 = 63;
                        } else {
                            i13 += 2;
                            iCharAt2 = ((cCharAt2 - 55232) << 10) | (text.charAt(i19) - 56320);
                        }
                        if (i9 < 0 && i9 < 128) {
                            encodeUTF8.put(i14, (byte) i9);
                            i18 = 1;
                        } else if (128 > i9 && i9 < 2048) {
                            encodeUTF8.put(i14, (byte) (((i9 >> 6) & 31) | 192));
                            encodeUTF8.put(i14 + 1, (byte) ((i9 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                            i18 = 2;
                        } else if (2048 > i9 && i9 < 65536) {
                            encodeUTF8.put(i14, (byte) (((i9 >> 12) & 15) | 224));
                            encodeUTF8.put(i14 + 1, (byte) (((i9 >> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                            encodeUTF8.put(i14 + 2, (byte) ((i9 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                            i18 = i6;
                        } else {
                            if (65536 <= i9 || i9 >= 1114112) {
                                l(i9);
                                throw null;
                            }
                            encodeUTF8.put(i14, (byte) (((i9 >> 18) & 7) | 240));
                            encodeUTF8.put(i14 + 1, (byte) (((i9 >> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                            encodeUTF8.put(i14 + 2, (byte) (((i9 >> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                            encodeUTF8.put(i14 + 3, (byte) ((i9 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                        }
                        i14 += i18;
                        i10 = i6;
                        s3 = s;
                    } else {
                        i13 = i19;
                        iCharAt2 = cCharAt2;
                    }
                    i9 = iCharAt2;
                    if (i9 < 0) {
                        if (128 > i9) {
                            if (2048 > i9) {
                                if (65536 <= i9) {
                                }
                                l(i9);
                                throw null;
                            }
                            if (65536 <= i9) {
                            }
                            l(i9);
                            throw null;
                        }
                        if (2048 > i9) {
                            if (65536 <= i9) {
                            }
                            l(i9);
                            throw null;
                        }
                        if (65536 <= i9) {
                        }
                        l(i9);
                        throw null;
                    }
                    if (128 > i9) {
                        if (2048 > i9) {
                            if (65536 <= i9) {
                            }
                            l(i9);
                            throw null;
                        }
                        if (65536 <= i9) {
                        }
                        l(i9);
                        throw null;
                    }
                    if (2048 > i9) {
                        if (65536 <= i9) {
                        }
                        l(i9);
                        throw null;
                    }
                    if (65536 <= i9) {
                    }
                    l(i9);
                    throw null;
                    i14 += i18;
                    i10 = i6;
                    s3 = s;
                }
                if (i14 == i17) {
                    while (true) {
                        int i20 = i12 - i14;
                        if (i20 <= 0 || i13 >= iMin) {
                            break;
                        }
                        int i21 = i13 + 1;
                        char cCharAt3 = text.charAt(i13);
                        if (Character.isHighSurrogate(cCharAt3)) {
                            if (i21 == iMin || !Character.isLowSurrogate(text.charAt(i21))) {
                                i13 = i21;
                                i7 = 63;
                            } else {
                                i13 += 2;
                                iCharAt = ((cCharAt3 - 55232) << 10) | (text.charAt(i21) - 56320);
                            }
                            if (i11 <= i7 || i7 >= 128) {
                                if (128 > i7 && i7 < 2048) {
                                    i11 = 2;
                                } else if (2048 > i7 && i7 < 65536) {
                                    i11 = i6;
                                } else {
                                    if (65536 <= i7 || i7 >= 1114112) {
                                        l(i7);
                                        throw null;
                                    }
                                    i11 = 4;
                                }
                            }
                            if (i11 > i20) {
                                i13--;
                                break;
                            }
                            if (i7 < 0 && i7 < 128) {
                                encodeUTF8.put(i14, (byte) i7);
                                i8 = i11;
                            } else if (128 > i7 && i7 < 2048) {
                                encodeUTF8.put(i14, (byte) (((i7 >> 6) & 31) | 192));
                                encodeUTF8.put(i14 + 1, (byte) ((i7 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                i8 = 2;
                            } else if (2048 > i7 && i7 < 65536) {
                                encodeUTF8.put(i14, (byte) (((i7 >> 12) & 15) | 224));
                                encodeUTF8.put(i14 + 1, (byte) (((i7 >> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                encodeUTF8.put(i14 + 2, (byte) ((i7 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                i8 = i6;
                            } else {
                                if (65536 <= i7 || i7 >= 1114112) {
                                    l(i7);
                                    throw null;
                                }
                                encodeUTF8.put(i14, (byte) (((i7 >> 18) & 7) | 240));
                                encodeUTF8.put(i14 + 1, (byte) (((i7 >> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                encodeUTF8.put(i14 + 2, (byte) (((i7 >> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                encodeUTF8.put(i14 + 3, (byte) ((i7 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                i8 = 4;
                            }
                            i14 += i8;
                            i11 = i11;
                        } else {
                            i13 = i21;
                            iCharAt = cCharAt3;
                        }
                        i7 = iCharAt;
                        if (i11 <= i7) {
                            if (128 > i7) {
                                if (2048 > i7) {
                                    if (65536 <= i7) {
                                    }
                                    l(i7);
                                    throw null;
                                }
                                if (65536 <= i7) {
                                }
                                l(i7);
                                throw null;
                            }
                            if (2048 > i7) {
                                if (65536 <= i7) {
                                }
                                l(i7);
                                throw null;
                            }
                            if (65536 <= i7) {
                            }
                            l(i7);
                            throw null;
                        }
                        if (128 > i7) {
                            if (2048 > i7) {
                                if (65536 <= i7) {
                                }
                                l(i7);
                                throw null;
                            }
                            if (65536 <= i7) {
                            }
                            l(i7);
                            throw null;
                        }
                        if (2048 > i7) {
                            if (65536 <= i7) {
                            }
                            l(i7);
                            throw null;
                        }
                        if (65536 <= i7) {
                        }
                        l(i7);
                        throw null;
                        if (i11 > i20) {
                            i13--;
                            break;
                        }
                        if (i7 < 0) {
                            if (128 > i7) {
                                if (2048 > i7) {
                                    if (65536 <= i7) {
                                    }
                                    l(i7);
                                    throw null;
                                }
                                if (65536 <= i7) {
                                }
                                l(i7);
                                throw null;
                            }
                            if (2048 > i7) {
                                if (65536 <= i7) {
                                }
                                l(i7);
                                throw null;
                            }
                            if (65536 <= i7) {
                            }
                            l(i7);
                            throw null;
                        }
                        if (128 > i7) {
                            if (2048 > i7) {
                                if (65536 <= i7) {
                                }
                                l(i7);
                                throw null;
                            }
                            if (65536 <= i7) {
                            }
                            l(i7);
                            throw null;
                        }
                        if (2048 > i7) {
                            if (65536 <= i7) {
                            }
                            l(i7);
                            throw null;
                        }
                        if (65536 <= i7) {
                        }
                        l(i7);
                        throw null;
                        i14 += i8;
                        i11 = i11;
                    }
                    s2 = (short) (i13 - i2);
                    C4352i82.a aVar = C4352i82.e;
                } else {
                    s2 = (short) (i13 - i2);
                    C4352i82.a aVar2 = C4352i82.e;
                }
                return ((s2 & s) << 16) | (((short) (i14 - i4)) & s);
            }
            encodeUTF8.put(i14, (byte) i16);
            i14++;
            i13 = i15;
        }
        s = 65535;
        s2 = (short) (i13 - i2);
        C4352i82.a aVar3 = C4352i82.e;
        return ((s2 & s) << 16) | (((short) (i14 - i4)) & s);
    }

    public static final void h(@NotNull CoroutineContext coroutineContext) {
        XF0 xf0 = (XF0) coroutineContext.p(XF0.a.d);
        if (xf0 != null && !xf0.g()) {
            throw xf0.C();
        }
    }

    @NotNull
    public static final C3429dk2 i(@NotNull Bk2 bk2) {
        Intrinsics.checkNotNullParameter(bk2, "<this>");
        return new C3429dk2(bk2.a, bk2.t);
    }

    public static A20 j(XF0 xf0, boolean z, AbstractC3746fG0 abstractC3746fG0, int i2) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        boolean z2 = (i2 & 2) != 0;
        if (xf0 instanceof C3956gG0) {
            return ((C3956gG0) xf0).Y(z, z2, abstractC3746fG0);
        }
        return xf0.A(z, z2, new C0639Az(1, abstractC3746fG0, InterfaceC2672aC0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 1));
    }

    public static boolean k(@NotNull String clazz, @Nullable DS0 ds0) {
        Class<?> cls;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        try {
            cls = Class.forName(clazz);
        } catch (ClassNotFoundException e2) {
            if (ds0 != null) {
                ds0.a("Class not available:" + clazz + ": " + e2);
            }
            cls = null;
        } catch (UnsatisfiedLinkError e3) {
            if (ds0 != null) {
                ds0.error("Failed to load (UnsatisfiedLinkError) " + clazz + ": " + e3);
            }
            cls = null;
        } catch (Throwable th) {
            if (ds0 != null) {
                ds0.error("Failed to initialize " + clazz + ": " + th);
            }
            cls = null;
        }
        return cls != null;
    }

    @NotNull
    public static final void l(int i2) {
        throw new IllegalArgumentException(C1332Jw.a(i2, "Malformed code-point ", " found"));
    }

    public static final void n(@NotNull View view, @Nullable OC1 oc1) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, oc1);
    }

    @Override // defpackage.InterfaceC4276hm2
    public Object a() {
        return new C4954km2();
    }

    public void m(@NotNull C7180vO0 classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
    }

    @Override // defpackage.C2943bS.b
    public Iterable r(Object obj) {
        Collection<? extends InterfaceC1490Lx> collectionU;
        InterfaceC1490Lx interfaceC1490Lx = (InterfaceC1490Lx) obj;
        return (interfaceC1490Lx == null || (collectionU = interfaceC1490Lx.u()) == null) ? C5653o60.d : collectionU;
    }
}
