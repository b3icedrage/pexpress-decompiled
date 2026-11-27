package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: fP1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3774fP1 implements InterfaceC0910El0 {
    public int[] a;
    public final InterfaceC0910El0.a c;
    public ByteBuffer d;
    public byte[] e;
    public short[] f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public final int[] j;
    public int k;
    public C1456Ll0 l;
    public Bitmap m;
    public final boolean n;
    public int o;
    public final int p;
    public final int q;
    public final int r;
    public Boolean s;
    public final int[] b = new int[UserVerificationMethods.USER_VERIFY_HANDPRINT];

    @NonNull
    public Bitmap.Config t = Bitmap.Config.ARGB_8888;

    public C3774fP1(@NonNull InterfaceC0910El0.a aVar, C1456Ll0 c1456Ll0, ByteBuffer byteBuffer, int i) {
        this.c = aVar;
        this.l = new C1456Ll0();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int iHighestOneBit = Integer.highestOneBit(i);
                this.o = 0;
                this.l = c1456Ll0;
                this.k = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.d.order(ByteOrder.LITTLE_ENDIAN);
                this.n = false;
                Iterator it = c1456Ll0.e.iterator();
                while (it.hasNext()) {
                    if (((C1222Il0) it.next()).g == 3) {
                        this.n = true;
                        break;
                    }
                }
                this.p = iHighestOneBit;
                int i2 = c1456Ll0.f;
                this.r = i2 / iHighestOneBit;
                int i3 = c1456Ll0.g;
                this.q = i3 / iHighestOneBit;
                int i4 = i2 * i3;
                OU0 ou0 = ((C0832Dl0) this.c).b;
                this.i = ou0 == null ? new byte[i4] : (byte[]) ou0.d(i4, byte[].class);
                InterfaceC0910El0.a aVar2 = this.c;
                int i5 = this.r * this.q;
                OU0 ou1 = ((C0832Dl0) aVar2).b;
                this.j = ou1 == null ? new int[i5] : (int[]) ou1.d(i5, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC0910El0
    public final synchronized Bitmap a() {
        try {
            if (this.l.c <= 0 || this.k < 0) {
                if (Log.isLoggable("fP1", 3)) {
                    int i = this.l.c;
                }
                this.o = 1;
            }
            int i2 = this.o;
            if (i2 != 1 && i2 != 2) {
                this.o = 0;
                if (this.e == null) {
                    OU0 ou0 = ((C0832Dl0) this.c).b;
                    this.e = ou0 == null ? new byte[255] : (byte[]) ou0.d(255, byte[].class);
                }
                C1222Il0 c1222Il0 = (C1222Il0) this.l.e.get(this.k);
                int i3 = this.k - 1;
                C1222Il0 c1222Il1 = i3 >= 0 ? (C1222Il0) this.l.e.get(i3) : null;
                int[] iArr = c1222Il0.k;
                if (iArr == null) {
                    iArr = this.l.a;
                }
                this.a = iArr;
                if (iArr == null) {
                    Log.isLoggable("fP1", 3);
                    this.o = 1;
                    return null;
                }
                if (c1222Il0.f) {
                    System.arraycopy(iArr, 0, this.b, 0, iArr.length);
                    int[] iArr2 = this.b;
                    this.a = iArr2;
                    iArr2[c1222Il0.h] = 0;
                    if (c1222Il0.g == 2 && this.k == 0) {
                        this.s = Boolean.TRUE;
                    }
                }
                return e(c1222Il0, c1222Il1);
            }
            Log.isLoggable("fP1", 3);
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b() {
        this.k = (this.k + 1) % this.l.c;
    }

    public final Bitmap c() {
        Boolean bool = this.s;
        Bitmap bitmapB = ((C0832Dl0) this.c).a.b(this.r, this.q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.t);
        bitmapB.setHasAlpha(true);
        return bitmapB;
    }

    public final void d(@NonNull Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v19, types: [short] */
    /* JADX WARN: Type inference failed for: r6v21 */
    public final Bitmap e(C1222Il0 c1222Il0, C1222Il0 c1222Il1) {
        byte b;
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        short s;
        int i7;
        Bitmap bitmap;
        int i8;
        int[] iArr2 = this.j;
        InterfaceC0910El0.a aVar = this.c;
        byte b2 = 0;
        if (c1222Il1 == null) {
            Bitmap bitmap2 = this.m;
            if (bitmap2 != null) {
                ((C0832Dl0) aVar).a.c(bitmap2);
            }
            this.m = null;
            Arrays.fill(iArr2, 0);
        }
        if (c1222Il1 != null && c1222Il1.g == 3 && this.m == null) {
            Arrays.fill(iArr2, 0);
        }
        if (c1222Il1 != null && (i7 = c1222Il1.g) > 0) {
            if (i7 == 2) {
                if (c1222Il0.f) {
                    i8 = 0;
                } else {
                    C1456Ll0 c1456Ll0 = this.l;
                    i8 = c1456Ll0.k;
                    if (c1222Il0.k != null && c1456Ll0.j == c1222Il0.h) {
                        i8 = 0;
                    }
                }
                int i9 = c1222Il1.d;
                int i10 = this.p;
                int i11 = i9 / i10;
                int i12 = c1222Il1.b / i10;
                int i13 = c1222Il1.c / i10;
                int i14 = c1222Il1.a / i10;
                int i15 = this.r;
                int i16 = (i12 * i15) + i14;
                int i17 = (i11 * i15) + i16;
                while (i16 < i17) {
                    int i18 = i16 + i13;
                    for (int i19 = i16; i19 < i18; i19++) {
                        iArr2[i19] = i8;
                    }
                    i16 += this.r;
                }
            } else if (i7 == 3 && (bitmap = this.m) != null) {
                int i20 = this.r;
                bitmap.getPixels(iArr2, 0, i20, 0, 0, i20, this.q);
            }
        }
        int[] iArr3 = iArr2;
        this.d.position(c1222Il0.j);
        int i21 = c1222Il0.c * c1222Il0.d;
        byte[] bArr = this.i;
        if (bArr == null || bArr.length < i21) {
            OU0 ou0 = ((C0832Dl0) aVar).b;
            this.i = ou0 == null ? new byte[i21] : (byte[]) ou0.d(i21, byte[].class);
        }
        byte[] bArr2 = this.i;
        if (this.f == null) {
            this.f = new short[4096];
        }
        short[] sArr = this.f;
        if (this.g == null) {
            this.g = new byte[4096];
        }
        byte[] bArr3 = this.g;
        if (this.h == null) {
            this.h = new byte[4097];
        }
        byte[] bArr4 = this.h;
        int i22 = this.d.get() & 255;
        int i23 = 1;
        int i24 = 1 << i22;
        int i25 = i24 + 1;
        int i26 = i24 + 2;
        int i27 = i22 + 1;
        int i28 = (1 << i27) - 1;
        int i29 = 0;
        while (i29 < i24) {
            sArr[i29] = 0;
            bArr3[i29] = (byte) i29;
            i29++;
            i23 = i23;
        }
        int i30 = i23;
        byte[] bArr5 = this.e;
        int i31 = i27;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = i26;
        int i41 = i28;
        int i42 = -1;
        while (true) {
            if (i32 >= i21) {
                iArr3 = iArr3;
                b = b2;
                break;
            }
            if (i33 == 0) {
                i6 = -1;
                int i43 = this.d.get() & 255;
                if (i43 > 0) {
                    ByteBuffer byteBuffer = this.d;
                    byteBuffer.get(this.e, 0, Math.min(i43, byteBuffer.remaining()));
                }
                if (i43 <= 0) {
                    this.o = 3;
                    b = 0;
                    break;
                }
                i33 = i43;
                i34 = 0;
            } else {
                iArr3 = iArr3;
                sArr = sArr;
                i6 = -1;
            }
            i36 += (bArr5[i34] & 255) << i35;
            i34++;
            i33--;
            i35 += 8;
            i40 = i40;
            i42 = i42;
            i31 = i31;
            i39 = i39;
            while (true) {
                i35 = i35;
                if (i35 < i31) {
                    b2 = 0;
                    break;
                }
                int i44 = i36 & i41;
                i36 >>= i31;
                i35 -= i31;
                if (i44 == i24) {
                    i31 = i27;
                    i40 = i26;
                    i41 = i28;
                    i35 = i35;
                    i42 = i6;
                } else {
                    if (i44 == i25) {
                        b2 = 0;
                        break;
                    }
                    int i45 = i32;
                    if (i42 == i6) {
                        bArr2[i37] = bArr3[i44];
                        i37++;
                        i32 = i45 + 1;
                        i42 = i44;
                        i39 = i42;
                    } else {
                        if (i44 >= i40) {
                            bArr4[i38] = (byte) i39;
                            i38++;
                            s = i42;
                        } else {
                            s = i44;
                        }
                        while (s >= i24) {
                            bArr4[i38] = bArr3[s];
                            i38++;
                            s = sArr[s];
                        }
                        i39 = bArr3[s] & 255;
                        byte b3 = (byte) i39;
                        bArr2[i37] = b3;
                        while (true) {
                            i37++;
                            i45++;
                            if (i38 <= 0) {
                                break;
                            }
                            i38--;
                            bArr2[i37] = bArr4[i38];
                        }
                        if (i40 < 4096) {
                            sArr[i40] = (short) i42;
                            bArr3[i40] = b3;
                            i40++;
                            if ((i40 & i41) == 0 && i40 < 4096) {
                                i31++;
                                i41 += i40;
                            }
                        }
                        i32 = i45;
                        i42 = i44;
                    }
                    i6 = -1;
                }
            }
        }
        Arrays.fill(bArr2, i37, i21, b);
        if (c1222Il0.e || this.p != i30) {
            int[] iArr4 = this.j;
            int i46 = c1222Il0.d;
            int i47 = this.p;
            int i48 = i46 / i47;
            int i49 = c1222Il0.b / i47;
            int i50 = c1222Il0.c / i47;
            int i51 = c1222Il0.a / i47;
            boolean z = this.k == 0;
            int i52 = this.r;
            int i53 = this.q;
            byte[] bArr6 = this.i;
            int[] iArr5 = this.a;
            Boolean bool = this.s;
            int i54 = 8;
            int i55 = 0;
            int i56 = 1;
            int i57 = 0;
            while (i57 < i48) {
                int[] iArr6 = iArr4;
                if (c1222Il0.e) {
                    if (i55 >= i48) {
                        i56++;
                        if (i56 == 2) {
                            i55 = 4;
                        } else if (i56 == 3) {
                            i54 = 4;
                            i55 = 2;
                        } else if (i56 == 4) {
                            i55 = 1;
                            i54 = 2;
                        }
                    }
                    i = i55 + i54;
                } else {
                    i = i55;
                    i55 = i57;
                }
                int i58 = i55 + i49;
                int i59 = i;
                boolean z2 = i47 == 1;
                if (i58 < i53) {
                    int i60 = i58 * i52;
                    int i61 = i60 + i51;
                    boolean z3 = z2;
                    int i62 = i61 + i50;
                    int i63 = i60 + i52;
                    if (i63 < i62) {
                        i62 = i63;
                    }
                    i2 = i48;
                    int i64 = i57 * i47 * c1222Il0.c;
                    if (z3) {
                        int i65 = i61;
                        while (i65 < i62) {
                            int i66 = i65;
                            int i67 = iArr5[bArr6[i64] & 255];
                            if (i67 != 0) {
                                iArr6[i66] = i67;
                            } else if (z && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i64 += i47;
                            i65 = i66 + 1;
                        }
                    } else {
                        int i68 = ((i62 - i61) * i47) + i64;
                        i3 = i47;
                        int i69 = i61;
                        while (i69 < i62) {
                            int i70 = i62;
                            int i71 = c1222Il0.c;
                            int i72 = i69;
                            int i73 = i64;
                            int i74 = 0;
                            int i75 = 0;
                            int i76 = 0;
                            int i77 = 0;
                            int i78 = 0;
                            while (true) {
                                if (i73 >= this.p + i64) {
                                    i4 = i49;
                                    break;
                                }
                                byte[] bArr7 = this.i;
                                i4 = i49;
                                if (i73 >= bArr7.length || i73 >= i68) {
                                    break;
                                }
                                int i79 = this.a[bArr7[i73] & 255];
                                if (i79 != 0) {
                                    i74 += (i79 >> 24) & 255;
                                    i75 += (i79 >> 16) & 255;
                                    i76 += (i79 >> 8) & 255;
                                    i77 += i79 & 255;
                                    i78++;
                                }
                                i73++;
                                i49 = i4;
                            }
                            int i80 = i64 + i71;
                            int i81 = i80;
                            while (i81 < this.p + i80) {
                                byte[] bArr8 = this.i;
                                int i82 = i80;
                                if (i81 >= bArr8.length || i81 >= i68) {
                                    break;
                                }
                                int i83 = this.a[bArr8[i81] & 255];
                                if (i83 != 0) {
                                    i74 += (i83 >> 24) & 255;
                                    i75 += (i83 >> 16) & 255;
                                    i76 += (i83 >> 8) & 255;
                                    i77 += i83 & 255;
                                    i78++;
                                }
                                i81++;
                                i80 = i82;
                            }
                            int i84 = i78 == 0 ? 0 : ((i74 / i78) << 24) | ((i75 / i78) << 16) | ((i76 / i78) << 8) | (i77 / i78);
                            if (i84 != 0) {
                                iArr6[i72] = i84;
                            } else if (z && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i64 += i3;
                            i69 = i72 + 1;
                            i62 = i70;
                            i49 = i4;
                        }
                    }
                    i57++;
                    iArr4 = iArr6;
                    i55 = i59;
                    i47 = i3;
                    i48 = i2;
                    i49 = i49;
                } else {
                    i2 = i48;
                }
                i3 = i47;
                i57++;
                iArr4 = iArr6;
                i55 = i59;
                i47 = i3;
                i48 = i2;
                i49 = i49;
            }
            if (this.s == null) {
                this.s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
            }
        } else {
            int[] iArr7 = this.j;
            int i85 = c1222Il0.d;
            int i86 = c1222Il0.b;
            int i87 = c1222Il0.c;
            int i88 = c1222Il0.a;
            byte b4 = this.k == 0 ? (byte) 1 : b;
            int i89 = this.r;
            byte[] bArr9 = this.i;
            int[] iArr8 = this.a;
            byte b5 = -1;
            for (int i90 = b; i90 < i85; i90++) {
                int i91 = (i90 + i86) * i89;
                int i92 = i91 + i88;
                int i93 = i92 + i87;
                int i94 = i91 + i89;
                if (i94 < i93) {
                    i93 = i94;
                }
                int i95 = c1222Il0.c * i90;
                while (i92 < i93) {
                    int[] iArr9 = iArr7;
                    byte b6 = bArr9[i95];
                    int i96 = i85;
                    int i97 = b6 & 255;
                    if (i97 != b5) {
                        int i98 = iArr8[i97];
                        if (i98 != 0) {
                            iArr9[i92] = i98;
                        } else {
                            b5 = b6;
                        }
                    }
                    i95++;
                    i92++;
                    iArr7 = iArr9;
                    i85 = i96;
                }
            }
            Boolean bool2 = this.s;
            this.s = Boolean.valueOf((bool2 != null && bool2.booleanValue()) || !(this.s != null || b4 == 0 || b5 == -1));
        }
        if (this.n && ((i5 = c1222Il0.g) == 0 || i5 == 1)) {
            if (this.m == null) {
                this.m = c();
            }
            Bitmap bitmap3 = this.m;
            int i99 = this.r;
            iArr = iArr3;
            bitmap3.setPixels(iArr, 0, i99, 0, 0, i99, this.q);
        } else {
            iArr = iArr3;
        }
        Bitmap bitmapC = c();
        int i100 = this.r;
        bitmapC.setPixels(iArr, 0, i100, 0, 0, i100, this.q);
        return bitmapC;
    }
}
