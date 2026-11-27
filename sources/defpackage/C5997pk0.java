package defpackage;

/* JADX INFO: renamed from: pk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5997pk0 extends AbstractC0595Ak0<C5997pk0, a> implements JZ0 {
    public static final int CPU_CLOCK_RATE_KHZ_FIELD_NUMBER = 2;
    public static final int CPU_PROCESSOR_COUNT_FIELD_NUMBER = 6;
    private static final C5997pk0 DEFAULT_INSTANCE;
    public static final int DEVICE_RAM_SIZE_KB_FIELD_NUMBER = 3;
    public static final int MAX_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 4;
    public static final int MAX_ENCOURAGED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 5;
    private static volatile InterfaceC5966pc1<C5997pk0> PARSER = null;
    public static final int PROCESS_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int cpuClockRateKhz_;
    private int cpuProcessorCount_;
    private int deviceRamSizeKb_;
    private int maxAppJavaHeapMemoryKb_;
    private int maxEncouragedAppJavaHeapMemoryKb_;
    private String processName_ = "";

    /* JADX INFO: renamed from: pk0$a */
    public static final class a extends AbstractC0595Ak0.a<C5997pk0, a> implements JZ0 {
        public a() {
            super(C5997pk0.DEFAULT_INSTANCE);
        }
    }

    static {
        C5997pk0 c5997pk0 = new C5997pk0();
        DEFAULT_INSTANCE = c5997pk0;
        AbstractC0595Ak0.u(C5997pk0.class, c5997pk0);
    }

    public static a B() {
        return DEFAULT_INSTANCE.p();
    }

    public static void w(C5997pk0 c5997pk0, int i) {
        c5997pk0.bitField0_ |= 16;
        c5997pk0.maxAppJavaHeapMemoryKb_ = i;
    }

    public static void x(C5997pk0 c5997pk0, int i) {
        c5997pk0.bitField0_ |= 32;
        c5997pk0.maxEncouragedAppJavaHeapMemoryKb_ = i;
    }

    public static void y(C5997pk0 c5997pk0, int i) {
        c5997pk0.bitField0_ |= 8;
        c5997pk0.deviceRamSizeKb_ = i;
    }

    public static C5997pk0 z() {
        return DEFAULT_INSTANCE;
    }

    public final boolean A() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // defpackage.AbstractC0595Ak0
    public final Object q(AbstractC0595Ak0.e eVar) {
        InterfaceC5966pc1 bVar;
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C1930Rm1(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006င\u0002", new Object[]{"bitField0_", "processName_", "cpuClockRateKhz_", "deviceRamSizeKb_", "maxAppJavaHeapMemoryKb_", "maxEncouragedAppJavaHeapMemoryKb_", "cpuProcessorCount_"});
            case 3:
                return new C5997pk0();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5966pc1<C5997pk0> interfaceC5966pc1 = PARSER;
                if (interfaceC5966pc1 != null) {
                    return interfaceC5966pc1;
                }
                synchronized (C5997pk0.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new AbstractC0595Ak0.b();
                            PARSER = bVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return bVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
