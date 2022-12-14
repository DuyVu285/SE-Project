USE [master]
GO
/****** Object:  Database [taxcal]    Script Date: 12/25/2022 3:17:10 PM ******/
CREATE DATABASE [taxcal]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'taxcal', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.SQLEXPRESS\MSSQL\DATA\taxcal.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'taxcal_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.SQLEXPRESS\MSSQL\DATA\taxcal_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT, LEDGER = OFF
GO
ALTER DATABASE [taxcal] SET COMPATIBILITY_LEVEL = 160
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [taxcal].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [taxcal] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [taxcal] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [taxcal] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [taxcal] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [taxcal] SET ARITHABORT OFF 
GO
ALTER DATABASE [taxcal] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [taxcal] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [taxcal] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [taxcal] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [taxcal] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [taxcal] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [taxcal] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [taxcal] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [taxcal] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [taxcal] SET  ENABLE_BROKER 
GO
ALTER DATABASE [taxcal] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [taxcal] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [taxcal] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [taxcal] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [taxcal] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [taxcal] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [taxcal] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [taxcal] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [taxcal] SET  MULTI_USER 
GO
ALTER DATABASE [taxcal] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [taxcal] SET DB_CHAINING OFF 
GO
ALTER DATABASE [taxcal] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [taxcal] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [taxcal] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [taxcal] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
ALTER DATABASE [taxcal] SET QUERY_STORE = ON
GO
ALTER DATABASE [taxcal] SET QUERY_STORE (OPERATION_MODE = READ_WRITE, CLEANUP_POLICY = (STALE_QUERY_THRESHOLD_DAYS = 30), DATA_FLUSH_INTERVAL_SECONDS = 900, INTERVAL_LENGTH_MINUTES = 60, MAX_STORAGE_SIZE_MB = 1000, QUERY_CAPTURE_MODE = AUTO, SIZE_BASED_CLEANUP_MODE = AUTO, MAX_PLANS_PER_QUERY = 200, WAIT_STATS_CAPTURE_MODE = ON)
GO
USE [taxcal]
GO
/****** Object:  Table [dbo].[Salary]    Script Date: 12/25/2022 3:17:10 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Salary](
	[SalaryID] [int] IDENTITY(1,1) NOT NULL,
	[UserID] [int] NULL,
	[Date] [date] NULL,
	[Base] [float] NULL,
	[Bonus] [float] NULL,
	[Tax_Rate] [float] NULL,
	[Total]  AS (([Base]+[Bonus])-([Base]+[Bonus])*[Tax_Rate]) PERSISTED,
 CONSTRAINT [PK_Salary] PRIMARY KEY CLUSTERED 
(
	[SalaryID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Tax]    Script Date: 12/25/2022 3:17:10 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Tax](
	[TaxID] [int] NOT NULL,
	[Tax_Rate] [float] NULL,
	[Lower_Limit] [float] NULL,
	[Upper_Limit] [float] NULL,
 CONSTRAINT [PK_Tax] PRIMARY KEY CLUSTERED 
(
	[TaxID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Users]    Script Date: 12/25/2022 3:17:10 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Users](
	[UserID] [int] IDENTITY(0,1) NOT NULL,
	[Username] [varchar](255) NULL,
	[Fullname] [varchar](255) NULL,
	[Password] [varchar](255) NULL,
	[Job] [varchar](255) NULL,
	[Phone] [varchar](50) NULL,
	[Address] [varchar](255) NULL,
	[Email] [varchar](255) NULL,
	[Role] [varchar](50) NULL,
 CONSTRAINT [PK__Users__1788CCAC1938458A] PRIMARY KEY CLUSTERED 
(
	[UserID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Salary] ON 

INSERT [dbo].[Salary] ([SalaryID], [UserID], [Date], [Base], [Bonus], [Tax_Rate]) VALUES (1, 2, CAST(N'2022-01-01' AS Date), 5000, 1000, 0.05)
INSERT [dbo].[Salary] ([SalaryID], [UserID], [Date], [Base], [Bonus], [Tax_Rate]) VALUES (2, 2, CAST(N'2022-01-02' AS Date), 12000, 1000, 0.1)
INSERT [dbo].[Salary] ([SalaryID], [UserID], [Date], [Base], [Bonus], [Tax_Rate]) VALUES (3, 3, CAST(N'2022-01-01' AS Date), 7000, 2000, 0.05)
INSERT [dbo].[Salary] ([SalaryID], [UserID], [Date], [Base], [Bonus], [Tax_Rate]) VALUES (4, 3, CAST(N'2022-01-02' AS Date), 22000, 1000, 0.15)
SET IDENTITY_INSERT [dbo].[Salary] OFF
GO
INSERT [dbo].[Tax] ([TaxID], [Tax_Rate], [Lower_Limit], [Upper_Limit]) VALUES (1, 0.05, 0, 10000)
INSERT [dbo].[Tax] ([TaxID], [Tax_Rate], [Lower_Limit], [Upper_Limit]) VALUES (2, 0.1, 10000, 20000)
INSERT [dbo].[Tax] ([TaxID], [Tax_Rate], [Lower_Limit], [Upper_Limit]) VALUES (3, 0.15, 20000, 30000)
GO
SET IDENTITY_INSERT [dbo].[Users] ON 

INSERT [dbo].[Users] ([UserID], [Username], [Fullname], [Password], [Job], [Phone], [Address], [Email], [Role]) VALUES (1, N'Admin', N'Nguyen Sy Hoang Dat', N'123456', N'Admin', N'0912387894', N'Thong Nhat', N'ititiu20035@student.edu.vn', N'Admin')
INSERT [dbo].[Users] ([UserID], [Username], [Fullname], [Password], [Job], [Phone], [Address], [Email], [Role]) VALUES (2, N'Duy', N'Vu Nhat Duy', N'123456', N'Employee', N'0913520526', N'74/18 Bau Cat 1', N'hcmiu@student.edu.vn', N'User')
INSERT [dbo].[Users] ([UserID], [Username], [Fullname], [Password], [Job], [Phone], [Address], [Email], [Role]) VALUES (3, N'Dang', N'Huynh Thanh Dang', N'Employee', N'123456', N'0912387895', N'Thu Duc', N'ititiu20033@student.edu.vn', N'User')
SET IDENTITY_INSERT [dbo].[Users] OFF
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'User Database' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'Users'
GO
USE [master]
GO
ALTER DATABASE [taxcal] SET  READ_WRITE 
GO
