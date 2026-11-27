package defpackage;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.sentry.android.core.b0;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: la0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5114la0 {
    public static final String[] D;
    public static final int[] E;
    public static final byte[] F;
    public static final d G;
    public static final d[][] H;
    public static final d[] I;
    public static final HashMap<Integer, d>[] J;
    public static final HashMap<String, d>[] K;
    public static final HashSet<String> L;
    public static final HashMap<Integer, Integer> M;
    public static final Charset N;
    public static final byte[] O;
    public static final byte[] P;
    public final FileDescriptor a;
    public final AssetManager.AssetInputStream b;
    public int c;
    public final HashMap<String, c>[] d;
    public final HashSet e;
    public ByteOrder f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public int k;
    public static final boolean l = Log.isLoggable("ExifInterface", 3);
    public static final List<Integer> m = Arrays.asList(1, 6, 3, 8);
    public static final List<Integer> n = Arrays.asList(2, 7, 4, 5);
    public static final int[] o = {8, 8, 8};
    public static final int[] p = {8};
    public static final byte[] q = {-1, -40, -1};
    public static final byte[] r = {102, 116, 121, 112};
    public static final byte[] s = {109, 105, 102, 49};
    public static final byte[] t = {104, 101, 105, 99};
    public static final byte[] u = {79, 76, 89, 77, 80, 0};
    public static final byte[] v = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] w = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] x = {101, 88, 73, 102};
    public static final byte[] y = {73, 72, 68, 82};
    public static final byte[] z = {73, 69, 78, 68};
    public static final byte[] A = {82, 73, 70, 70};
    public static final byte[] B = {87, 69, 66, 80};
    public static final byte[] C = {69, 88, 73, 70};

    /* JADX INFO: renamed from: la0$b */
    public static class b extends InputStream implements DataInput {
        public static final ByteOrder i = ByteOrder.LITTLE_ENDIAN;
        public static final ByteOrder j = ByteOrder.BIG_ENDIAN;
        public final DataInputStream d;
        public ByteOrder e;
        public int g;
        public byte[] h;

        public b(byte[] bArr) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            this(byteArrayInputStream, 0);
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.d.available();
        }

        public final void c(int i2) throws IOException {
            int i3 = 0;
            while (i3 < i2) {
                DataInputStream dataInputStream = this.d;
                int i4 = i2 - i3;
                int iSkip = (int) dataInputStream.skip(i4);
                if (iSkip <= 0) {
                    if (this.h == null) {
                        this.h = new byte[8192];
                    }
                    iSkip = dataInputStream.read(this.h, 0, Math.min(8192, i4));
                    if (iSkip == -1) {
                        throw new EOFException(C1332Jw.a(i2, "Reached EOF while skipping ", " bytes."));
                    }
                }
                i3 += iSkip;
            }
            this.g += i3;
        }

        @Override // java.io.InputStream
        public final void mark(int i2) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public final int read() {
            this.g++;
            return this.d.read();
        }

        @Override // java.io.DataInput
        public final boolean readBoolean() {
            this.g++;
            return this.d.readBoolean();
        }

        @Override // java.io.DataInput
        public final byte readByte() throws IOException {
            this.g++;
            int i2 = this.d.read();
            if (i2 >= 0) {
                return (byte) i2;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final char readChar() {
            this.g += 2;
            return this.d.readChar();
        }

        @Override // java.io.DataInput
        public final double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public final float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i2, int i3) throws IOException {
            this.g += i3;
            this.d.readFully(bArr, i2, i3);
        }

        @Override // java.io.DataInput
        public final int readInt() throws IOException {
            this.g += 4;
            DataInputStream dataInputStream = this.d;
            int i2 = dataInputStream.read();
            int i3 = dataInputStream.read();
            int i4 = dataInputStream.read();
            int i5 = dataInputStream.read();
            if ((i2 | i3 | i4 | i5) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.e;
            if (byteOrder == i) {
                return (i5 << 24) + (i4 << 16) + (i3 << 8) + i2;
            }
            if (byteOrder == j) {
                return (i2 << 24) + (i3 << 16) + (i4 << 8) + i5;
            }
            throw new IOException("Invalid byte order: " + this.e);
        }

        @Override // java.io.DataInput
        public final String readLine() {
            return null;
        }

        @Override // java.io.DataInput
        public final long readLong() throws IOException {
            long j2;
            long j3;
            this.g += 8;
            DataInputStream dataInputStream = this.d;
            int i2 = dataInputStream.read();
            int i3 = dataInputStream.read();
            int i4 = dataInputStream.read();
            int i5 = dataInputStream.read();
            int i6 = dataInputStream.read();
            int i7 = dataInputStream.read();
            int i8 = dataInputStream.read();
            int i9 = dataInputStream.read();
            if ((i2 | i3 | i4 | i5 | i6 | i7 | i8 | i9) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.e;
            if (byteOrder == i) {
                j2 = (((long) i9) << 56) + (((long) i8) << 48) + (((long) i7) << 40) + (((long) i6) << 32) + (((long) i5) << 24) + (((long) i4) << 16) + (((long) i3) << 8);
                j3 = i2;
            } else {
                if (byteOrder != j) {
                    throw new IOException("Invalid byte order: " + this.e);
                }
                j2 = (((long) i2) << 56) + (((long) i3) << 48) + (((long) i4) << 40) + (((long) i5) << 32) + (((long) i6) << 24) + (((long) i7) << 16) + (((long) i8) << 8);
                j3 = i9;
            }
            return j2 + j3;
        }

        @Override // java.io.DataInput
        public final short readShort() throws IOException {
            this.g += 2;
            DataInputStream dataInputStream = this.d;
            int i2 = dataInputStream.read();
            int i3 = dataInputStream.read();
            if ((i2 | i3) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.e;
            if (byteOrder == i) {
                return (short) ((i3 << 8) + i2);
            }
            if (byteOrder == j) {
                return (short) ((i2 << 8) + i3);
            }
            throw new IOException("Invalid byte order: " + this.e);
        }

        @Override // java.io.DataInput
        public final String readUTF() {
            this.g += 2;
            return this.d.readUTF();
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() {
            this.g++;
            return this.d.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public final int readUnsignedShort() throws IOException {
            this.g += 2;
            DataInputStream dataInputStream = this.d;
            int i2 = dataInputStream.read();
            int i3 = dataInputStream.read();
            if ((i2 | i3) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.e;
            if (byteOrder == i) {
                return (i3 << 8) + i2;
            }
            if (byteOrder == j) {
                return (i2 << 8) + i3;
            }
            throw new IOException("Invalid byte order: " + this.e);
        }

        @Override // java.io.InputStream
        public final void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public final int skipBytes(int i2) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(InputStream inputStream) {
            this(inputStream, 0);
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        }

        public b(InputStream inputStream, int i2) {
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            this.e = byteOrder;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.d = dataInputStream;
            dataInputStream.mark(0);
            this.g = 0;
            this.e = byteOrder;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i2, int i3) throws IOException {
            int i4 = this.d.read(bArr, i2, i3);
            this.g += i4;
            return i4;
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) throws IOException {
            this.g += bArr.length;
            this.d.readFully(bArr);
        }
    }

    /* JADX INFO: renamed from: la0$c */
    public static class c {
        public final int a;
        public final int b;
        public final long c;
        public final byte[] d;

        public c(byte[] bArr, int i, int i2) {
            this(-1L, bArr, i, i2);
        }

        public static c a(long j, ByteOrder byteOrder) {
            long[] jArr = {j};
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C5114la0.E[4]]);
            byteBufferWrap.order(byteOrder);
            byteBufferWrap.putInt((int) jArr[0]);
            return new c(byteBufferWrap.array(), 4, 1);
        }

        public static c b(e eVar, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C5114la0.E[5]]);
            byteBufferWrap.order(byteOrder);
            e eVar2 = new e[]{eVar}[0];
            byteBufferWrap.putInt((int) eVar2.a);
            byteBufferWrap.putInt((int) eVar2.b);
            return new c(byteBufferWrap.array(), 5, 1);
        }

        public static c c(int i, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C5114la0.E[3]]);
            byteBufferWrap.order(byteOrder);
            byteBufferWrap.putShort((short) new int[]{i}[0]);
            return new c(byteBufferWrap.array(), 3, 1);
        }

        public final double d(ByteOrder byteOrder) throws Throwable {
            Object objG = g(byteOrder);
            if (objG == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objG instanceof String) {
                return Double.parseDouble((String) objG);
            }
            if (objG instanceof long[]) {
                long[] jArr = (long[]) objG;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objG instanceof int[]) {
                int[] iArr = (int[]) objG;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objG instanceof double[]) {
                double[] dArr = (double[]) objG;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objG instanceof e[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            e[] eVarArr = (e[]) objG;
            if (eVarArr.length != 1) {
                throw new NumberFormatException("There are more than one component");
            }
            e eVar = eVarArr[0];
            return eVar.a / eVar.b;
        }

        public final int e(ByteOrder byteOrder) throws Throwable {
            Object objG = g(byteOrder);
            if (objG == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objG instanceof String) {
                return Integer.parseInt((String) objG);
            }
            if (objG instanceof long[]) {
                long[] jArr = (long[]) objG;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objG instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objG;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public final String f(ByteOrder byteOrder) throws Throwable {
            Object objG = g(byteOrder);
            if (objG == null) {
                return null;
            }
            if (objG instanceof String) {
                return (String) objG;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (objG instanceof long[]) {
                long[] jArr = (long[]) objG;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objG instanceof int[]) {
                int[] iArr = (int[]) objG;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objG instanceof double[]) {
                double[] dArr = (double[]) objG;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(objG instanceof e[])) {
                return null;
            }
            e[] eVarArr = (e[]) objG;
            while (i < eVarArr.length) {
                sb.append(eVarArr[i].a);
                sb.append('/');
                sb.append(eVarArr[i].b);
                i++;
                if (i != eVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        /* JADX WARN: Code duplicated, block: B:153:0x016d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Not initialized variable reg: 6, insn: 0x0033: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:52), block:B:16:0x0033 */
        /* JADX WARN: Type inference failed for: r15v22, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v23, types: [java.io.Serializable, long[]] */
        /* JADX WARN: Type inference failed for: r15v24, types: [java.io.Serializable, la0$e[]] */
        /* JADX WARN: Type inference failed for: r15v25, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v27, types: [java.io.Serializable, la0$e[]] */
        /* JADX WARN: Type inference failed for: r15v28, types: [double[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
        public final Serializable g(ByteOrder byteOrder) throws Throwable {
            b bVar;
            InputStream inputStream;
            byte b;
            String string;
            int length = 0;
            byte[] bArr = this.d;
            InputStream inputStream2 = null;
            try {
                try {
                    try {
                        bVar = new b(bArr);
                        try {
                            bVar.e = byteOrder;
                            int i = this.a;
                            int i2 = this.b;
                            switch (i) {
                                case 1:
                                case 6:
                                    if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                                        String str = new String(bArr, C5114la0.N);
                                        try {
                                            bVar.close();
                                            return str;
                                        } catch (IOException e) {
                                            b0.d("ExifInterface", "IOException occurred while closing InputStream", e);
                                            return str;
                                        }
                                    }
                                    String str2 = new String(new char[]{(char) (b + 48)});
                                    try {
                                        bVar.close();
                                        return str2;
                                    } catch (IOException e2) {
                                        b0.d("ExifInterface", "IOException occurred while closing InputStream", e2);
                                        return str2;
                                    }
                                case 2:
                                case 7:
                                    if (i2 >= C5114la0.F.length) {
                                        int i3 = 0;
                                        while (true) {
                                            byte[] bArr2 = C5114la0.F;
                                            if (i3 >= bArr2.length) {
                                                length = bArr2.length;
                                            } else if (bArr[i3] == bArr2[i3]) {
                                                i3++;
                                            }
                                        }
                                    }
                                    StringBuilder sb = new StringBuilder();
                                    try {
                                        while (length < i2) {
                                            byte b2 = bArr[length];
                                            if (b2 == 0) {
                                                string = sb.toString();
                                                bVar.close();
                                                return string;
                                            }
                                            if (b2 >= 32) {
                                                sb.append((char) b2);
                                            } else {
                                                sb.append('?');
                                            }
                                            length++;
                                        }
                                        bVar.close();
                                        return string;
                                    } catch (IOException e3) {
                                        b0.d("ExifInterface", "IOException occurred while closing InputStream", e3);
                                        return string;
                                    }
                                    string = sb.toString();
                                case 3:
                                    ?? r15 = new int[i2];
                                    while (length < i2) {
                                        r15[length] = bVar.readUnsignedShort();
                                        length++;
                                    }
                                    try {
                                        bVar.close();
                                        return r15;
                                    } catch (IOException e4) {
                                        b0.d("ExifInterface", "IOException occurred while closing InputStream", e4);
                                        return r15;
                                    }
                                case 4:
                                    ?? r16 = new long[i2];
                                    while (length < i2) {
                                        r16[length] = ((long) bVar.readInt()) & 4294967295L;
                                        length++;
                                    }
                                    try {
                                        bVar.close();
                                        return r16;
                                    } catch (IOException e5) {
                                        b0.d("ExifInterface", "IOException occurred while closing InputStream", e5);
                                        return r16;
                                    }
                                case 5:
                                    ?? r17 = new e[i2];
                                    while (length < i2) {
                                        r17[length] = new e(((long) bVar.readInt()) & 4294967295L, ((long) bVar.readInt()) & 4294967295L);
                                        length++;
                                    }
                                    try {
                                        bVar.close();
                                        return r17;
                                    } catch (IOException e6) {
                                        b0.d("ExifInterface", "IOException occurred while closing InputStream", e6);
                                        return r17;
                                    }
                                case 8:
                                    ?? r18 = new int[i2];
                                    while (length < i2) {
                                        r18[length] = bVar.readShort();
                                        length++;
                                    }
                                    try {
                                        bVar.close();
                                        return r18;
                                    } catch (IOException e7) {
                                        b0.d("ExifInterface", "IOException occurred while closing InputStream", e7);
                                        return r18;
                                    }
                                case 9:
                                    ?? r19 = new int[i2];
                                    while (length < i2) {
                                        r19[length] = bVar.readInt();
                                        length++;
                                    }
                                    try {
                                        bVar.close();
                                        return r19;
                                    } catch (IOException e8) {
                                        b0.d("ExifInterface", "IOException occurred while closing InputStream", e8);
                                        return r19;
                                    }
                                case 10:
                                    ?? r110 = new e[i2];
                                    while (length < i2) {
                                        r110[length] = new e(bVar.readInt(), bVar.readInt());
                                        length++;
                                    }
                                    try {
                                        bVar.close();
                                        return r110;
                                    } catch (IOException e9) {
                                        b0.d("ExifInterface", "IOException occurred while closing InputStream", e9);
                                        return r110;
                                    }
                                case 11:
                                    ?? r111 = new double[i2];
                                    while (length < i2) {
                                        r111[length] = bVar.readFloat();
                                        length++;
                                    }
                                    try {
                                        bVar.close();
                                        return r111;
                                    } catch (IOException e10) {
                                        b0.d("ExifInterface", "IOException occurred while closing InputStream", e10);
                                        return r111;
                                    }
                                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                    ?? r112 = new double[i2];
                                    while (length < i2) {
                                        r112[length] = bVar.readDouble();
                                        length++;
                                    }
                                    try {
                                        bVar.close();
                                        return r112;
                                    } catch (IOException e11) {
                                        b0.d("ExifInterface", "IOException occurred while closing InputStream", e11);
                                        return r112;
                                    }
                                default:
                                    bVar.close();
                                    return null;
                            }
                        } catch (IOException e12) {
                            e = e12;
                            b0.f("ExifInterface", "IOException occurred during reading a value", e);
                            if (bVar != null) {
                                bVar.close();
                            }
                            return null;
                        }
                    } catch (Throwable th) {
                        th = th;
                        inputStream2 = inputStream;
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (IOException e13) {
                                b0.d("ExifInterface", "IOException occurred while closing InputStream", e13);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e14) {
                    e = e14;
                    bVar = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                    throw th;
                }
            } catch (IOException e15) {
                b0.d("ExifInterface", "IOException occurred while closing InputStream", e15);
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("(");
            sb.append(C5114la0.D[this.a]);
            sb.append(", data length:");
            return SK.b(sb, this.d.length, ")");
        }

        public c(long j, byte[] bArr, int i, int i2) {
            this.a = i;
            this.b = i2;
            this.c = j;
            this.d = bArr;
        }
    }

    /* JADX INFO: renamed from: la0$e */
    public static class e {
        public final long a;
        public final long b;

        public e(long j, long j2) {
            if (j2 == 0) {
                this.a = 0L;
                this.b = 1L;
            } else {
                this.a = j;
                this.b = j2;
            }
        }

        public final String toString() {
            return this.a + "/" + this.b;
        }
    }

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        D = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        E = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        F = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", UserVerificationMethods.USER_VERIFY_HANDPRINT, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", UserVerificationMethods.USER_VERIFY_HANDPRINT, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Xmp", 700, 1), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        G = new d("StripOffsets", 273, 3);
        H = new d[][]{dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, new d[]{new d("ThumbnailImage", UserVerificationMethods.USER_VERIFY_HANDPRINT, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        I = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        J = new HashMap[10];
        K = new HashMap[10];
        L = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        M = new HashMap<>();
        Charset charsetForName = Charset.forName("US-ASCII");
        N = charsetForName;
        O = "Exif\u0000\u0000".getBytes(charsetForName);
        P = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            d[][] dVarArr6 = H;
            if (i >= dVarArr6.length) {
                HashMap<Integer, Integer> map = M;
                d[] dVarArr7 = I;
                map.put(Integer.valueOf(dVarArr7[0].a), 5);
                map.put(Integer.valueOf(dVarArr7[1].a), 1);
                map.put(Integer.valueOf(dVarArr7[2].a), 2);
                map.put(Integer.valueOf(dVarArr7[3].a), 3);
                map.put(Integer.valueOf(dVarArr7[4].a), 7);
                map.put(Integer.valueOf(dVarArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            J[i] = new HashMap<>();
            K[i] = new HashMap<>();
            for (d dVar : dVarArr6[i]) {
                J[i].put(Integer.valueOf(dVar.a), dVar);
                K[i].put(dVar.b, dVar);
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00d1 A[Catch: all -> 0x0057, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0057, blocks: (B:12:0x0048, B:14:0x004b, B:21:0x0060, B:27:0x007d, B:29:0x0088, B:37:0x009e, B:32:0x008f, B:35:0x0097, B:36:0x009b, B:38:0x00a8, B:40:0x00b1, B:42:0x00b7, B:44:0x00bd, B:46:0x00c3, B:51:0x00d1), top: B:64:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    public C5114la0(@NonNull InputStream inputStream) throws Throwable {
        d[][] dVarArr = H;
        this.d = new HashMap[dVarArr.length];
        this.e = new HashSet(dVarArr.length);
        this.f = ByteOrder.BIG_ENDIAN;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.b = (AssetManager.AssetInputStream) inputStream;
            this.a = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                C5537na0.a.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.b = null;
                this.a = fileInputStream.getFD();
            } catch (Exception unused) {
                this.b = null;
                this.a = null;
            }
        } else {
            this.b = null;
            this.a = null;
        }
        boolean z2 = l;
        for (int i = 0; i < dVarArr.length; i++) {
            try {
                try {
                    this.d[i] = new HashMap<>();
                } catch (Throwable th) {
                    a();
                    if (z2) {
                        q();
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                if (z2) {
                    b0.f("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (!z2) {
                    return;
                }
            } catch (UnsupportedOperationException e3) {
                e = e3;
                if (z2) {
                    b0.f("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (!z2) {
                    return;
                }
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int iG = g(bufferedInputStream);
        this.c = iG;
        if (iG == 4 || iG == 9 || iG == 13 || iG == 14) {
            b bVar = new b(bufferedInputStream);
            int i2 = this.c;
            if (i2 == 4) {
                f(bVar, 0, 0);
            } else if (i2 == 13) {
                i(bVar);
            } else if (i2 == 9) {
                j(bVar);
            } else if (i2 == 14) {
                m(bVar);
            }
        } else {
            f fVar = new f(bufferedInputStream);
            int i3 = this.c;
            if (i3 == 12) {
                e(fVar);
            } else if (i3 == 7) {
                h(fVar);
            } else if (i3 == 10) {
                l(fVar);
            } else {
                k(fVar);
            }
            fVar.f(this.h);
            v(fVar);
        }
        a();
        if (!z2) {
            return;
        }
        q();
    }

    public static ByteOrder r(b bVar) throws IOException {
        short s2 = bVar.readShort();
        if (s2 == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s2 == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s2));
    }

    public final void a() {
        String strB = b("DateTimeOriginal");
        HashMap<String, c>[] mapArr = this.d;
        if (strB != null && b("DateTime") == null) {
            HashMap<String, c> map = mapArr[0];
            byte[] bytes = strB.concat("\u0000").getBytes(N);
            map.put("DateTime", new c(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", c.a(0L, this.f));
        }
        if (b("ImageLength") == null) {
            mapArr[0].put("ImageLength", c.a(0L, this.f));
        }
        if (b("Orientation") == null) {
            mapArr[0].put("Orientation", c.a(0L, this.f));
        }
        if (b("LightSource") == null) {
            mapArr[1].put("LightSource", c.a(0L, this.f));
        }
    }

    public final String b(@NonNull String str) {
        c cVarD = d(str);
        if (cVarD != null) {
            if (!L.contains(str)) {
                return cVarD.f(this.f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = cVarD.a;
                if (i != 5 && i != 10) {
                    b0.e("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                e[] eVarArr = (e[]) cVarD.g(this.f);
                if (eVarArr == null || eVarArr.length != 3) {
                    b0.e("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                e eVar = eVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (eVar.a / eVar.b));
                e eVar2 = eVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (eVar2.a / eVar2.b));
                e eVar3 = eVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (eVar3.a / eVar3.b)));
            }
            try {
                return Double.toString(cVarD.d(this.f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int c() {
        c cVarD = d("Orientation");
        if (cVarD == null) {
            return 1;
        }
        try {
            return cVarD.e(this.f);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    public final c d(@NonNull String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < H.length; i++) {
            c cVar = this.d[i].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    public final void e(f fVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                C5537na0.b.a(mediaMetadataRetriever, new a(fVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap<String, c>[] mapArr = this.d;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", c.c(Integer.parseInt(strExtractMetadata), this.f));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", c.c(Integer.parseInt(strExtractMetadata2), this.f));
                }
                if (strExtractMetadata3 != null) {
                    int i2 = Integer.parseInt(strExtractMetadata3);
                    if (i2 == 90) {
                        i = 6;
                    } else if (i2 != 180) {
                        i = i2 != 270 ? 1 : 8;
                    } else {
                        i = 3;
                    }
                    mapArr[0].put("Orientation", c.c(i, this.f));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i3 = Integer.parseInt(strExtractMetadata4);
                    int i4 = Integer.parseInt(strExtractMetadata5);
                    if (i4 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.f(i3);
                    byte[] bArr = new byte[6];
                    if (fVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i5 = i3 + 6;
                    int i6 = i4 - 6;
                    if (!Arrays.equals(bArr, O)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i6];
                    if (fVar.read(bArr2) != i6) {
                        throw new IOException("Can't read exif");
                    }
                    this.h = i5;
                    s(0, bArr2);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x006b A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x008c  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:74:0x0105 A[LOOP:2: B:69:0x00fb->B:74:0x0105, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x0117  */
    /* JADX WARN: Code duplicated, block: B:82:0x014c A[LOOP:0: B:10:0x0024->B:82:0x014c, LOOP_END] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void f(defpackage.C5114la0.b r23, int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5114la0.f(la0$b, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0126 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:104:0x0129  */
    /* JADX WARN: Code duplicated, block: B:107:0x012f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0137 A[LOOP:2: B:105:0x012a->B:110:0x0137, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x013d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:115:0x0140  */
    /* JADX WARN: Code duplicated, block: B:118:0x0146  */
    /* JADX WARN: Code duplicated, block: B:121:0x014e A[LOOP:3: B:116:0x0141->B:121:0x014e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:125:0x0157  */
    /* JADX WARN: Code duplicated, block: B:128:0x0161 A[LOOP:4: B:123:0x0152->B:128:0x0161, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:131:0x0167 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:146:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x013a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x014c A[EDGE_INSN: B:158:0x014c->B:120:0x014c BREAK  A[LOOP:3: B:116:0x0141->B:121:0x014e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x014c A[EDGE_INSN: B:160:0x014c->B:120:0x014c BREAK  A[LOOP:3: B:116:0x0141->B:121:0x014e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:86:0x0107  */
    /* JADX WARN: Code duplicated, block: B:87:0x0109  */
    public final int g(BufferedInputStream bufferedInputStream) throws Throwable {
        b bVar;
        b bVar2;
        b bVar3;
        b bVar4;
        boolean z2;
        b bVar5;
        b bVar6;
        boolean z3;
        int i;
        byte[] bArr;
        boolean z4;
        int i2;
        byte[] bArr2;
        int i3;
        byte[] bArr3;
        boolean z5;
        b bVar7;
        short s2;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr4 = new byte[5000];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i4 = 0;
        while (true) {
            byte[] bArr5 = q;
            if (i4 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i4] != bArr5[i4]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i5 = 0; i5 < bytes.length; i5++) {
                    if (bArr4[i5] != bytes[i5]) {
                        try {
                            bVar2 = new b(bArr4);
                            try {
                                long j2 = bVar2.readInt();
                                byte[] bArr6 = new byte[4];
                                bVar2.read(bArr6);
                                if (Arrays.equals(bArr6, r)) {
                                    if (j2 == 1) {
                                        j2 = bVar2.readLong();
                                        j = 16;
                                        if (j2 < 16) {
                                        }
                                    } else {
                                        j = 8;
                                    }
                                    long j3 = 5000;
                                    if (j2 > j3) {
                                        j2 = j3;
                                    }
                                    long j4 = j2 - j;
                                    if (j4 >= 8) {
                                        byte[] bArr7 = new byte[4];
                                        boolean z6 = false;
                                        boolean z7 = false;
                                        for (long j5 = 0; j5 < j4 / 4 && bVar2.read(bArr7) == 4; j5++) {
                                            if (j5 != 1) {
                                                if (Arrays.equals(bArr7, s)) {
                                                    z6 = true;
                                                } else if (Arrays.equals(bArr7, t)) {
                                                    z7 = true;
                                                }
                                                if (z6 && z7) {
                                                    bVar2.close();
                                                    return 12;
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                                if (bVar2 != null) {
                                }
                                bVar4 = new b(bArr4);
                                ByteOrder byteOrderR = r(bVar4);
                                this.f = byteOrderR;
                                bVar4.e = byteOrderR;
                                s2 = bVar4.readShort();
                                if (s2 != 20306) {
                                    z2 = true;
                                } else {
                                    z2 = true;
                                }
                                bVar4.close();
                                if (z2) {
                                    return 7;
                                }
                                try {
                                    bVar7 = new b(bArr4);
                                    try {
                                        ByteOrder byteOrderR2 = r(bVar7);
                                        this.f = byteOrderR2;
                                        bVar7.e = byteOrderR2;
                                        if (bVar7.readShort() == 85) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        bVar7.close();
                                    } catch (Exception unused2) {
                                        bVar6 = bVar7;
                                        if (bVar6 != null) {
                                            bVar6.close();
                                        }
                                        z3 = false;
                                    } catch (Throwable th) {
                                        th = th;
                                        bVar5 = bVar7;
                                        if (bVar5 != null) {
                                            bVar5.close();
                                        }
                                        throw th;
                                    }
                                } catch (Exception unused3) {
                                    bVar6 = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    bVar5 = null;
                                }
                                if (z3) {
                                    return 10;
                                }
                                i = 0;
                                while (true) {
                                    bArr = w;
                                    if (i < bArr.length) {
                                        z4 = true;
                                        break;
                                    }
                                    if (bArr4[i] != bArr[i]) {
                                        z4 = false;
                                        break;
                                    }
                                    i++;
                                }
                                if (z4) {
                                    return 13;
                                }
                                i2 = 0;
                                while (true) {
                                    bArr2 = A;
                                    if (i2 < bArr2.length) {
                                        i3 = 0;
                                        while (true) {
                                            bArr3 = B;
                                            if (i3 < bArr3.length) {
                                                z5 = true;
                                                break;
                                            }
                                            if (bArr4[bArr2.length + i3 + 4] != bArr3[i3]) {
                                                break;
                                            }
                                            i3++;
                                        }
                                        if (z5) {
                                            return 14;
                                        }
                                        return 0;
                                    }
                                    if (bArr4[i2] != bArr2[i2]) {
                                        break;
                                    }
                                    i2++;
                                }
                                z5 = false;
                                if (z5) {
                                    return 14;
                                }
                                return 0;
                            } catch (Throwable th3) {
                                th = th3;
                                bVar = bVar2;
                                if (bVar != null) {
                                    bVar.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused4) {
                            bVar2 = null;
                        } catch (Throwable th4) {
                            th = th4;
                            bVar = null;
                        }
                        bVar2.close();
                        try {
                            bVar4 = new b(bArr4);
                            try {
                                ByteOrder byteOrderR3 = r(bVar4);
                                this.f = byteOrderR3;
                                bVar4.e = byteOrderR3;
                                s2 = bVar4.readShort();
                                if (s2 != 20306 || s2 == 21330) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                bVar4.close();
                            } catch (Exception unused5) {
                                if (bVar4 != null) {
                                    bVar4.close();
                                }
                                z2 = false;
                            } catch (Throwable th5) {
                                th = th5;
                                bVar3 = bVar4;
                                if (bVar3 != null) {
                                    bVar3.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused6) {
                            bVar4 = null;
                        } catch (Throwable th6) {
                            th = th6;
                            bVar3 = null;
                        }
                        if (z2) {
                            return 7;
                        }
                        bVar7 = new b(bArr4);
                        ByteOrder byteOrderR4 = r(bVar7);
                        this.f = byteOrderR4;
                        bVar7.e = byteOrderR4;
                        if (bVar7.readShort() == 85) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        bVar7.close();
                        if (z3) {
                            return 10;
                        }
                        i = 0;
                        while (true) {
                            bArr = w;
                            if (i < bArr.length) {
                                z4 = true;
                                break;
                            }
                            if (bArr4[i] != bArr[i]) {
                                z4 = false;
                                break;
                            }
                            i++;
                        }
                        if (z4) {
                            return 13;
                        }
                        i2 = 0;
                        while (true) {
                            bArr2 = A;
                            if (i2 < bArr2.length) {
                                i3 = 0;
                                while (true) {
                                    bArr3 = B;
                                    if (i3 < bArr3.length) {
                                        z5 = true;
                                        break;
                                    }
                                    if (bArr4[bArr2.length + i3 + 4] != bArr3[i3]) {
                                        break;
                                        break;
                                    }
                                    i3++;
                                }
                                if (z5) {
                                    return 14;
                                }
                                return 0;
                            }
                            if (bArr4[i2] != bArr2[i2]) {
                                break;
                                break;
                            }
                            i2++;
                        }
                        z5 = false;
                        if (z5) {
                            return 14;
                        }
                        return 0;
                    }
                }
                return 9;
            }
            i4++;
        }
    }

    public final void h(f fVar) throws Throwable {
        int i;
        int i2;
        k(fVar);
        HashMap<String, c>[] mapArr = this.d;
        c cVar = mapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.d);
            fVar2.e = this.f;
            byte[] bArr = u;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.f(0L);
            byte[] bArr3 = v;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.f(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.f(12L);
            }
            t(fVar2, 6);
            c cVar2 = mapArr[7].get("PreviewImageStart");
            c cVar3 = mapArr[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", cVar2);
                mapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = mapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.g(this.f);
                if (iArr == null || iArr.length != 4) {
                    b0.e("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                c cVarC = c.c(i5, this.f);
                c cVarC2 = c.c(i6, this.f);
                mapArr[0].put("ImageWidth", cVarC);
                mapArr[0].put("ImageLength", cVarC2);
            }
        }
    }

    public final void i(b bVar) throws Throwable {
        if (l) {
            Objects.toString(bVar);
        }
        bVar.e = ByteOrder.BIG_ENDIAN;
        byte[] bArr = w;
        bVar.c(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = bVar.readInt();
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, y)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, z)) {
                    return;
                }
                if (Arrays.equals(bArr2, x)) {
                    byte[] bArr3 = new byte[i];
                    if (bVar.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + C5537na0.a(bArr2));
                    }
                    int i3 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.h = i2;
                        s(0, bArr3);
                        y();
                        v(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = i + 4;
                bVar.c(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void j(b bVar) throws Throwable {
        if (l) {
            Objects.toString(bVar);
        }
        bVar.c(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        bVar.c(i - bVar.g);
        bVar.read(bArr4);
        f(new b(bArr4), i, 5);
        bVar.c(i3 - bVar.g);
        bVar.e = ByteOrder.BIG_ENDIAN;
        int i4 = bVar.readInt();
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == G.a) {
                short s2 = bVar.readShort();
                short s3 = bVar.readShort();
                c cVarC = c.c(s2, this.f);
                c cVarC2 = c.c(s3, this.f);
                HashMap<String, c>[] mapArr = this.d;
                mapArr[0].put("ImageLength", cVarC);
                mapArr[0].put("ImageWidth", cVarC2);
                return;
            }
            bVar.c(unsignedShort2);
        }
    }

    public final void k(f fVar) throws Throwable {
        p(fVar);
        t(fVar, 0);
        x(fVar, 0);
        x(fVar, 5);
        x(fVar, 4);
        y();
        if (this.c == 8) {
            HashMap<String, c>[] mapArr = this.d;
            c cVar = mapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.d);
                fVar2.e = this.f;
                fVar2.c(6);
                t(fVar2, 9);
                c cVar2 = mapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    mapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void l(f fVar) throws Throwable {
        if (l) {
            Objects.toString(fVar);
        }
        k(fVar);
        HashMap<String, c>[] mapArr = this.d;
        c cVar = mapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            f(new b(cVar.d), (int) cVar.c, 5);
        }
        c cVar2 = mapArr[0].get("ISO");
        c cVar3 = mapArr[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", cVar2);
    }

    public final void m(b bVar) throws Throwable {
        if (l) {
            Objects.toString(bVar);
        }
        bVar.e = ByteOrder.LITTLE_ENDIAN;
        bVar.c(A.length);
        int i = bVar.readInt() + 8;
        byte[] bArr = B;
        bVar.c(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i2 = bVar.readInt();
                int i3 = length + 8;
                if (Arrays.equals(C, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    if (bVar.read(bArr3) == i2) {
                        this.h = i3;
                        s(0, bArr3);
                        v(new b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + C5537na0.a(bArr2));
                    }
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.c(i2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void n(b bVar, HashMap map) throws Throwable {
        c cVar = (c) map.get("JPEGInterchangeFormat");
        c cVar2 = (c) map.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int iE = cVar.e(this.f);
        int iE2 = cVar2.e(this.f);
        if (this.c == 7) {
            iE += this.i;
        }
        if (iE <= 0 || iE2 <= 0 || this.b != null || this.a != null) {
            return;
        }
        bVar.skip(iE);
        bVar.read(new byte[iE2]);
    }

    public final boolean o(HashMap map) {
        c cVar = (c) map.get("ImageLength");
        c cVar2 = (c) map.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.e(this.f) <= 512 && cVar2.e(this.f) <= 512;
    }

    public final void p(f fVar) throws IOException {
        ByteOrder byteOrderR = r(fVar);
        this.f = byteOrderR;
        fVar.e = byteOrderR;
        int unsignedShort = fVar.readUnsignedShort();
        int i = this.c;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i2 = fVar.readInt();
        if (i2 < 8) {
            throw new IOException(EK.e(i2, "Invalid first Ifd offset: "));
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            fVar.c(i3);
        }
    }

    public final void q() throws Throwable {
        int i = 0;
        while (true) {
            HashMap<String, c>[] mapArr = this.d;
            if (i >= mapArr.length) {
                return;
            }
            mapArr[i].size();
            for (Map.Entry<String, c> entry : mapArr[i].entrySet()) {
                c value = entry.getValue();
                entry.getKey();
                value.toString();
                value.f(this.f);
            }
            i++;
        }
    }

    public final void s(int i, byte[] bArr) throws IOException {
        f fVar = new f(bArr);
        p(fVar);
        t(fVar, i);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x019f  */
    /* JADX WARN: Code duplicated, block: B:103:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:19:0x0077  */
    /* JADX WARN: Code duplicated, block: B:98:0x018c  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void t(f fVar, int i) throws IOException {
        HashMap<String, c>[] mapArr;
        boolean z2;
        HashSet hashSet;
        long j;
        int i2;
        boolean z3;
        HashSet hashSet2;
        int unsignedShort;
        long j2;
        Integer numValueOf = Integer.valueOf(fVar.g);
        HashSet hashSet3 = this.e;
        hashSet3.add(numValueOf);
        short s2 = fVar.readShort();
        if (s2 <= 0) {
            return;
        }
        short s3 = 0;
        while (true) {
            mapArr = this.d;
            z2 = l;
            if (s3 >= s2) {
                break;
            }
            int unsignedShort2 = fVar.readUnsignedShort();
            int unsignedShort3 = fVar.readUnsignedShort();
            int i3 = fVar.readInt();
            short s4 = s3;
            long j3 = ((long) fVar.g) + 4;
            d dVar = J[i].get(Integer.valueOf(unsignedShort2));
            if (z2) {
                String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i), Integer.valueOf(unsignedShort2), dVar != null ? dVar.b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i3));
            }
            if (dVar != null && unsignedShort3 > 0) {
                int[] iArr = E;
                if (unsignedShort3 < iArr.length) {
                    int i4 = dVar.c;
                    if (i4 == 7 || unsignedShort3 == 7 || i4 == unsignedShort3 || (i2 = dVar.d) == unsignedShort3 || (((i4 == 4 || i2 == 4) && unsignedShort3 == 3) || (((i4 == 9 || i2 == 9) && unsignedShort3 == 8) || ((i4 == 12 || i2 == 12) && unsignedShort3 == 11)))) {
                        if (unsignedShort3 == 7) {
                            unsignedShort3 = i4;
                        }
                        hashSet = hashSet3;
                        j = ((long) i3) * ((long) iArr[unsignedShort3]);
                        z3 = j >= 0 && j <= 2147483647L;
                    } else {
                        if (z2) {
                            String str = D[unsignedShort3];
                        }
                        hashSet = hashSet3;
                        j = 0;
                    }
                } else {
                    hashSet = hashSet3;
                    j = 0;
                }
            } else {
                hashSet = hashSet3;
                j = 0;
            }
            if (z3) {
                if (j > 4) {
                    int i5 = fVar.readInt();
                    if (this.c == 7) {
                        if ("MakerNote".equals(dVar.b)) {
                            this.i = i5;
                        } else if (i == 6 && "ThumbnailImage".equals(dVar.b)) {
                            this.j = i5;
                            this.k = i3;
                            c cVarC = c.c(6, this.f);
                            c cVarA = c.a(this.j, this.f);
                            c cVarA2 = c.a(this.k, this.f);
                            mapArr[4].put("Compression", cVarC);
                            mapArr[4].put("JPEGInterchangeFormat", cVarA);
                            mapArr[4].put("JPEGInterchangeFormatLength", cVarA2);
                        }
                    }
                    fVar.f(i5);
                } else {
                    z2 = z2;
                    i3 = i3;
                }
                Integer num = M.get(Integer.valueOf(unsignedShort2));
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            j2 = ((long) fVar.readInt()) & 4294967295L;
                        } else if (unsignedShort3 == 8) {
                            unsignedShort = fVar.readShort();
                        } else if (unsignedShort3 == 9 || unsignedShort3 == 13) {
                            unsignedShort = fVar.readInt();
                        } else {
                            j2 = -1;
                        }
                        if (z2) {
                            String.format("Offset: %d, tagName: %s", Long.valueOf(j2), dVar.b);
                        }
                        if (j2 > 0) {
                            hashSet2 = hashSet;
                            if (!hashSet2.contains(Integer.valueOf((int) j2))) {
                                fVar.f(j2);
                                t(fVar, num.intValue());
                            }
                        } else {
                            hashSet2 = hashSet;
                        }
                        fVar.f(j3);
                    } else {
                        unsignedShort = fVar.readUnsignedShort();
                    }
                    j2 = unsignedShort;
                    if (z2) {
                        String.format("Offset: %d, tagName: %s", Long.valueOf(j2), dVar.b);
                    }
                    if (j2 > 0) {
                        hashSet2 = hashSet;
                        if (!hashSet2.contains(Integer.valueOf((int) j2))) {
                            fVar.f(j2);
                            t(fVar, num.intValue());
                        }
                    } else {
                        hashSet2 = hashSet;
                    }
                    fVar.f(j3);
                } else {
                    hashSet2 = hashSet;
                    int i6 = fVar.g + this.h;
                    byte[] bArr = new byte[(int) j];
                    fVar.readFully(bArr);
                    c cVar = new c(i6, bArr, unsignedShort3, i3);
                    mapArr[i].put(dVar.b, cVar);
                    String str2 = dVar.b;
                    if ("DNGVersion".equals(str2)) {
                        this.c = 3;
                    }
                    if ((("Make".equals(str2) || "Model".equals(str2)) && cVar.f(this.f).contains("PENTAX")) || ("Compression".equals(str2) && cVar.e(this.f) == 65535)) {
                        this.c = 8;
                    }
                    if (fVar.g != j3) {
                        fVar.f(j3);
                    }
                }
            } else {
                fVar.f(j3);
                hashSet2 = hashSet;
            }
            s3 = (short) (s4 + 1);
            hashSet3 = hashSet2;
            s2 = s2;
        }
        HashSet hashSet4 = hashSet3;
        int i7 = fVar.readInt();
        if (z2) {
            String.format("nextIfdOffset: %d", Integer.valueOf(i7));
        }
        long j4 = i7;
        if (j4 <= 0 || hashSet4.contains(Integer.valueOf(i7))) {
            return;
        }
        fVar.f(j4);
        if (mapArr[4].isEmpty()) {
            t(fVar, 4);
        } else if (mapArr[5].isEmpty()) {
            t(fVar, 5);
        }
    }

    public final void u(int i, String str, String str2) {
        HashMap<String, c>[] mapArr = this.d;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap<String, c> map = mapArr[i];
        map.put(str2, map.get(str));
        mapArr[i].remove(str);
    }

    public final void v(b bVar) throws Throwable {
        c cVar;
        HashMap<String, c> map = this.d[4];
        c cVar2 = map.get("Compression");
        if (cVar2 == null) {
            n(bVar, map);
            return;
        }
        int iE = cVar2.e(this.f);
        if (iE != 1) {
            if (iE == 6) {
                n(bVar, map);
                return;
            } else if (iE != 7) {
                return;
            }
        }
        c cVar3 = map.get("BitsPerSample");
        if (cVar3 != null) {
            int[] iArr = (int[]) cVar3.g(this.f);
            int[] iArr2 = o;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.c != 3 || (cVar = map.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int iE2 = cVar.e(this.f);
                if ((iE2 != 1 || !Arrays.equals(iArr, p)) && (iE2 != 6 || !Arrays.equals(iArr, iArr2))) {
                    return;
                }
            }
            c cVar4 = map.get("StripOffsets");
            c cVar5 = map.get("StripByteCounts");
            if (cVar4 == null || cVar5 == null) {
                return;
            }
            long[] jArrB = C5537na0.b(cVar4.g(this.f));
            long[] jArrB2 = C5537na0.b(cVar5.g(this.f));
            if (jArrB == null || jArrB.length == 0) {
                b0.e("ExifInterface", "stripOffsets should not be null or have zero length.");
                return;
            }
            if (jArrB2 == null || jArrB2.length == 0) {
                b0.e("ExifInterface", "stripByteCounts should not be null or have zero length.");
                return;
            }
            if (jArrB.length != jArrB2.length) {
                b0.e("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                return;
            }
            long j = 0;
            for (long j2 : jArrB2) {
                j += j2;
            }
            byte[] bArr = new byte[(int) j];
            this.g = true;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < jArrB.length; i3++) {
                int i4 = (int) jArrB[i3];
                int i5 = (int) jArrB2[i3];
                if (i3 < jArrB.length - 1 && i4 + i5 != jArrB[i3 + 1]) {
                    this.g = false;
                }
                int i6 = i4 - i;
                if (i6 < 0) {
                    return;
                }
                long j3 = i6;
                if (bVar.skip(j3) != j3) {
                    return;
                }
                int i7 = i + i6;
                byte[] bArr2 = new byte[i5];
                if (bVar.read(bArr2) != i5) {
                    return;
                }
                i = i7 + i5;
                System.arraycopy(bArr2, 0, bArr, i2, i5);
                i2 += i5;
            }
            if (this.g) {
                long j4 = jArrB[0];
            }
        }
    }

    public final void w(int i, int i2) throws Throwable {
        HashMap<String, c>[] mapArr = this.d;
        if (mapArr[i].isEmpty() || mapArr[i2].isEmpty()) {
            return;
        }
        c cVar = mapArr[i].get("ImageLength");
        c cVar2 = mapArr[i].get("ImageWidth");
        c cVar3 = mapArr[i2].get("ImageLength");
        c cVar4 = mapArr[i2].get("ImageWidth");
        if (cVar == null || cVar2 == null || cVar3 == null || cVar4 == null) {
            return;
        }
        int iE = cVar.e(this.f);
        int iE2 = cVar2.e(this.f);
        int iE3 = cVar3.e(this.f);
        int iE4 = cVar4.e(this.f);
        if (iE >= iE3 || iE2 >= iE4) {
            return;
        }
        HashMap<String, c> map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    public final void x(f fVar, int i) throws Throwable {
        c cVarC;
        c cVarC2;
        HashMap<String, c>[] mapArr = this.d;
        c cVar = mapArr[i].get("DefaultCropSize");
        c cVar2 = mapArr[i].get("SensorTopBorder");
        c cVar3 = mapArr[i].get("SensorLeftBorder");
        c cVar4 = mapArr[i].get("SensorBottomBorder");
        c cVar5 = mapArr[i].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.a == 5) {
                e[] eVarArr = (e[]) cVar.g(this.f);
                if (eVarArr == null || eVarArr.length != 2) {
                    b0.e("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
                cVarC = c.b(eVarArr[0], this.f);
                cVarC2 = c.b(eVarArr[1], this.f);
            } else {
                int[] iArr = (int[]) cVar.g(this.f);
                if (iArr == null || iArr.length != 2) {
                    b0.e("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                cVarC = c.c(iArr[0], this.f);
                cVarC2 = c.c(iArr[1], this.f);
            }
            mapArr[i].put("ImageWidth", cVarC);
            mapArr[i].put("ImageLength", cVarC2);
            return;
        }
        if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int iE = cVar2.e(this.f);
            int iE2 = cVar4.e(this.f);
            int iE3 = cVar5.e(this.f);
            int iE4 = cVar3.e(this.f);
            if (iE2 <= iE || iE3 <= iE4) {
                return;
            }
            c cVarC3 = c.c(iE2 - iE, this.f);
            c cVarC4 = c.c(iE3 - iE4, this.f);
            mapArr[i].put("ImageLength", cVarC3);
            mapArr[i].put("ImageWidth", cVarC4);
            return;
        }
        c cVar6 = mapArr[i].get("ImageLength");
        c cVar7 = mapArr[i].get("ImageWidth");
        if (cVar6 == null || cVar7 == null) {
            c cVar8 = mapArr[i].get("JPEGInterchangeFormat");
            c cVar9 = mapArr[i].get("JPEGInterchangeFormatLength");
            if (cVar8 == null || cVar9 == null) {
                return;
            }
            int iE5 = cVar8.e(this.f);
            int iE6 = cVar8.e(this.f);
            fVar.f(iE5);
            byte[] bArr = new byte[iE6];
            fVar.read(bArr);
            f(new b(bArr), iE5, i);
        }
    }

    public final void y() throws Throwable {
        w(0, 5);
        w(0, 4);
        w(5, 4);
        HashMap<String, c>[] mapArr = this.d;
        c cVar = mapArr[1].get("PixelXDimension");
        c cVar2 = mapArr[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            mapArr[0].put("ImageWidth", cVar);
            mapArr[0].put("ImageLength", cVar2);
        }
        if (mapArr[4].isEmpty() && o(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        o(mapArr[4]);
        u(0, "ThumbnailOrientation", "Orientation");
        u(0, "ThumbnailImageLength", "ImageLength");
        u(0, "ThumbnailImageWidth", "ImageWidth");
        u(5, "ThumbnailOrientation", "Orientation");
        u(5, "ThumbnailImageLength", "ImageLength");
        u(5, "ThumbnailImageWidth", "ImageWidth");
        u(4, "Orientation", "ThumbnailOrientation");
        u(4, "ImageLength", "ThumbnailImageLength");
        u(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* JADX INFO: renamed from: la0$f */
    public static class f extends b {
        public f(byte[] bArr) {
            super(bArr);
            this.d.mark(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }

        public final void f(long j) throws IOException {
            int i = this.g;
            if (i > j) {
                this.g = 0;
                this.d.reset();
            } else {
                j -= (long) i;
            }
            c((int) j);
        }

        public f(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.d.mark(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    /* JADX INFO: renamed from: la0$d */
    public static class d {
        public final int a;
        public final String b;
        public final int c;
        public final int d;

        public d(String str, int i, int i2) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = -1;
        }

        public d(String str, int i, int i2, int i3) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = i3;
        }
    }

    /* JADX INFO: renamed from: la0$a */
    public class a extends MediaDataSource {
        public long d;
        public final /* synthetic */ f e;

        public a(f fVar) {
            this.e = fVar;
        }

        @Override // android.media.MediaDataSource
        public final long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public final int readAt(long j, byte[] bArr, int i, int i2) {
            if (i2 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                long j2 = this.d;
                f fVar = this.e;
                if (j2 != j) {
                    if (j2 >= 0 && j >= j2 + ((long) fVar.d.available())) {
                        return -1;
                    }
                    fVar.f(j);
                    this.d = j;
                }
                if (i2 > fVar.d.available()) {
                    i2 = fVar.d.available();
                }
                int i3 = fVar.read(bArr, i, i2);
                if (i3 >= 0) {
                    this.d += (long) i3;
                    return i3;
                }
            } catch (IOException unused) {
            }
            this.d = -1L;
            return -1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }
}
