#include <iostream>
using namespace std;

void spiralPrint(int input[][1000], int M, int N){
	int top = 0, bottom = M - 1;
	int left = 0, right = N - 1;

	while (1)
	{
		if (left > right)
			break;
		// print top row
		for (int i = left; i <= right; i++)
			cout << input[top][i] << " ";
		top++;

		if (top > bottom)
			break;
		// print right column
		for (int i = top; i <= bottom; i++)
			cout << input[i][right] << " ";
		right--;

		if (left > right)
			break;
		// print bottom row
		for (int i = right; i >= left; i--)
			cout << input[bottom][i] << " ";
		bottom--;

		if (top > bottom)
			break;
		// print left column
		for (int i = bottom; i >= top; i--)
			cout << input[i][left] << " ";
		left++;
	}

}

